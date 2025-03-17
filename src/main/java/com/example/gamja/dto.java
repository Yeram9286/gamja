package com.example.gamja;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dto {

    private long id;
    @NotBlank//칸이 비어있으면 안되는걸 검증
    private String name;

    @Email //올바른 이메일 형식인지 검증
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
