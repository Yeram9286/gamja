package com.example.gamja;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserService {  // 클래스명 변경
    private final repository userRepository;

    // 생성자 추가
    public UserService(repository userRepository) {
        this.userRepository = userRepository;
    }

    // 회원 가입
    public User registerUser(dto userDto) {
        Optional<User> existingUser = userRepository.findByEmail(userDto.getEmail()); //레포지토리에서이메일찾기
        if (existingUser.isPresent()) {//예외처리 -> existingUser에 위임(함수처럼 씀), 이미 있다면(없다면 엠티,널
            throw new IllegalArgumentException("이미 가입된 이메일입니다.");
        }

        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        return userRepository.save(user);
    }

    // 회원 조회
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));
    }

    // 회원 삭제
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

