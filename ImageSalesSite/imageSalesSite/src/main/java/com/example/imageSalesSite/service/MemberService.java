package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.Member;

import java.util.List;

public interface MemberService {

    // 회원 테이블의 데이터 건수를 반환한다.
    public long countAll() throws Exception;

    // 최초 관리자 생성을 위한 데이터를 등록한다.
    public void setupAdmin(Member member) throws Exception;

    // 등록 처리
    public void register(Member member) throws Exception;

    // 상세 화면
    public Member read(Long userNo) throws Exception;

    // 수정 처리
    public void modify(Member member) throws Exception;

    // 삭제 처리
    public void remove(Long userNo) throws Exception;

    // 목록 화면
    public List<Member> list() throws Exception;


    // 사용자 보유 코인을 반환한다.
    public int getCoin(Long userNo) throws Exception;
}
