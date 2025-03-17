package com.example.gamja;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
//User에 대한 CRUD기능을 수행할수있도록 함
public interface repository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
