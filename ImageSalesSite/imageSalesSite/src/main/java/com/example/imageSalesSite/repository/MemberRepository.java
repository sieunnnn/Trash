package com.example.imageSalesSite.repository;

import com.example.imageSalesSite.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // 로그인
    List<Member> findByUserId(String userName);

}
