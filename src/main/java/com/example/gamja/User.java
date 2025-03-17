package com.example.gamja;

import jakarta.persistence.*;
import lombok.*; // getter,setter,기본생성자 어노테이션 자동생성

@Entity //엔티티 선언, 데이터베이스 User테이블과 자동 매핑, 기본생성자가 꼭 필요함
@Table(name = "users") //데이터베이스 테이블 이름 지정(user는 sql 예약어라 users가 좋음
@Getter @Setter//필드값을 읽어오는 메서드 자동생성, 값변경 메서드 자동생성
@NoArgsConstructor //기본생성자
@AllArgsConstructor//클래스의 모든 필드를 포함하는 생성자를 자동으로 생성해줌, LOMBOK제공
public class User {
    @Id //기본키 지정(PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가 ID
    private Long id;

    @Column(nullable = false)//테이블 컬럼속성 지정( 빈칸 안됨
    private String name; // 사용자 이름

    @Column(nullable = false, unique = true)//중복안돼
    private String email; // 이메일 (중복 방지)

    @Column(nullable = false) //빈칸 안돼
    private String password; // 비밀번호
}
