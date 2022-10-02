package com.example.serversecurity.repository;

import com.example.serversecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRespository extends JpaRepository<User,Integer> {

    @Query("""
            SELECT u FROM User u WHERE u.username = :username
    """)
    Optional<User> findByUsername(String username);
}
