package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.Member;

public interface MemberService {

    // 회원 테이블의 데이터 건수를 반환한다.
    public long countAll() throws Exception;

    // 최초 관리자 생성을 위한 데이터를 등록한다.
    public void setupAdmin(Member member) throws Exception;

    // 등록 처리
    public void register(Member member) throws Exception;
}
