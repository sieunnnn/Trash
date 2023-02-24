package com.example.imageSalesSite.repository;

import com.example.imageSalesSite.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // 로그인
    List<Member> findByUserId(String userName);

    // 모든 회원 목록 반환
    @Query("SELECT m.userNo, m.userPw, m.userName, cd.codeName, m.coin, m.regDate"
    + "FROM Member m"
    + "INNER JOIN CodeDetail cd ON cd.codeValue = m.job"
    + "INNER JOIN CodeGroup cg ON cg.groupCode = cd.groupCode"
    + "WHERE cg.groupCode = 'A01' ORDER BY m.regDate DESC")
    public List<Object[]> listAllMember();

}
