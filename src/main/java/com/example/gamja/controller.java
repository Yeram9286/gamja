package com.example.gamja;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class controller {
    private final UserService userService;

    public controller(UserService userService) {
        this.userService = userService;
    }

    // 회원 가입
    @PostMapping("/signUp")
    public ResponseEntity<User> registerUser(@Valid @RequestBody dto userDto) {
        return ResponseEntity.ok(userService.registerUser(userDto));
    }

    // 특정 회원 조회
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    // 회원 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("사용자가 삭제되었습니다.");
    }
}
