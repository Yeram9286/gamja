package com.example.gamja;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController //JSON 형식으로 응답반환하는 웹 서비스 만들때 사용
@RequestMapping("/users") //해당 컨트롤러 경로설정
public class controller {
    private final UserService userService;

    public controller(UserService userService) {
        this.userService = userService;
    }

    // 회원 가입
    @PostMapping("/signUp") //HTTP POST요청처리 메서드
    public ResponseEntity<User> registerUser(@Valid @RequestBody dto userDto) { 
                                            //dto 유효성 검사
                                            //클리이언트에서 보낸 객체를 JSON형식으로 반환
        return ResponseEntity.ok(userService.registerUser(userDto));
    }

    // 특정 회원 조회
    @GetMapping("/{id}") // GET요청처리 메서드
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
                                            //@GetMapping("/{id}")의 {id} 값을 메서드의 id 변수에 할당 
        return ResponseEntity.ok(userService.getUserById(id));
    }

    // 회원 삭제
    @DeleteMapping("/{id}") //DELETE요청처리 메서드
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("사용자가 삭제되었습니다.");
    }
}
