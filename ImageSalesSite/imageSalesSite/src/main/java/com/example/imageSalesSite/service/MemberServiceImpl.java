package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.Member;
import com.example.imageSalesSite.domain.MemberAuth;
import com.example.imageSalesSite.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    // 등록 처리
    @Override
    public void register(Member member) throws Exception {
        Member memberEntity = new Member();
        memberEntity.setUserId(member.getUserId());
        memberEntity.setUserPw(member.getUserPw());
        memberEntity.setUserName(member.getUserName());
        memberEntity.setJob(member.getJob());

        // 회원 권한 생성
        MemberAuth memberAuth = new MemberAuth();
        memberAuth.setAuth("ROLE_MEMBER");

        memberEntity.addAuth(memberAuth);

        repository.save(memberEntity);

    }

    // 상세 화면
    @Override
    public Member read(Long userNo) throws Exception {
        return repository.getById(userNo);
    }

    // 수정 처리
    @Override
    public void modify(Member member) throws Exception {

        Member memberEntity = repository.getById(member.getUserNo());
        memberEntity.setUserName(member.getUserName());
        memberEntity.setJob(member.getJob());

        // 회원 권한 수정
        memberEntity.clearAuthList();
        List<MemberAuth> authList = member.getAuthList();
        for(int i = 0; i < authList.size(); i++) {
            MemberAuth auth = authList.get(i);

            memberEntity.addAuth(auth);
        }

        repository.save(memberEntity);
    }

    // 삭제 처리
    @Override
    public void remove(Long userNo) throws Exception {
        repository.deleteById(userNo);
    }

    // 목록 화면
    @Override
    public List<Member> list() throws Exception {

        List<Object[]> valueArrays = repository.listAllMember();

        List<Member> memberList = new ArrayList<Member>();
        for(Object[] valueArray : valueArrays) {
            Member member = new Member();

            member.setUserNo((Long) valueArray[0]);
            member.setUserId((String) valueArray[1]);
            member.setUserPw((String) valueArray[2]);
            member.setUserName((String) valueArray[3]);
            member.setJob((String) valueArray[4]);
            member.setCoin((int) valueArray[5]);
            member.setRegDate((LocalDateTime) valueArray[6]);

            memberList.add(member);
        }

        return memberList;
    }

}
