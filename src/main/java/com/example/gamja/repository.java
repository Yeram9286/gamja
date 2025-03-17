package com.example.gamja;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface repository extends JpaRepository<User, Long> {//데이터베이스의 User테이블, 기본타입
                                                                //즉 User와 관련된 CRUD기능 수행
    Optional<User> findByEmail(String email); //이메일 기준으로 유저 조회
    //Optional(User)-> 이메일 기준으로 조회했을때 데이터가 없을수도있기때문에
}
//엔티티 저장, ID로 엔티티조회, 모든 엔티티조회, 엔티티 삭제
//ID로 엔티티 삭제, 총개수 반환, ID가 존재하는지확인
//이 모든기능을 구현한 클래스를 자동생성해주기때문에 우리가 일일이 클래스를 구현할 필요가 없음
//코드량이 줄고 유지보수가 쉬워짐
