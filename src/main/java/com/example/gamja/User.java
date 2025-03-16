package com.example.gamja;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor//노랭이 골뱅이 왜 있는지 , (어노테이션) 각자의 기능 알기!
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가 ID
    private Long id;

    @Column(nullable = false)
    private String name; // 사용자 이름

    @Column(nullable = false, unique = true)
    private String email; // 이메일 (중복 방지)

    @Column(nullable = false)
    private String password; // 비밀번호
}
