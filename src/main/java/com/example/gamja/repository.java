package com.example.gamja;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface repository extends JpaRepository<User, Long> {//jparepository가 뭐하는애인지 공부(중요)
    Optional<User> findByEmail(String email);
}
