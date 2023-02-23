package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.Member;
import com.example.imageSalesSite.domain.MemberAuth;
import com.example.imageSalesSite.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService{

    private final MemberRepository repository;

    // 회원 테이즐의 데이터 건수를 반환한다.
    @Override
    public long countAll() throws Exception {
        return repository.count();
    }

    // 최초 관리자를 생성한다.
    @Override
    public void setupAdmin(Member member) throws Exception {

        Member memberEntity = new Member();
        memberEntity.setUserId(member.getUserId());
        memberEntity.setUserPw(member.getUserPw());
        memberEntity.setUserName(member.getUserName());
        memberEntity.setJob(member.getJob());

        // 관리자 권한 생성
        MemberAuth memberAuth = new MemberAuth();
        memberAuth.setAuth("ROLE_ADMIN");
        memberEntity.addAuth(memberAuth);

        repository.save(memberEntity);
    }
}
