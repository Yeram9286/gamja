package com.example.gamja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Spring Boot설정 자동 구성
public class GamjaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamjaApplication.class, args);
        //자동으로 Spring Boot가 웹서버와 애플리케이션 실행
    }

}
