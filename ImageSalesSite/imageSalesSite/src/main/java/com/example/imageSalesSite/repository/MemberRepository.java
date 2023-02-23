package com.example.imageSalesSite.repository;

import com.example.imageSalesSite.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
