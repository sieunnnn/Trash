package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.ChargeCoin;
import com.example.imageSalesSite.domain.Member;
import com.example.imageSalesSite.repository.ChargeCoinRepository;
import com.example.imageSalesSite.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CoinServiceImpl implements CoinService {
    
    private final ChargeCoinRepository chargeCoinRepository;
    
    private final MemberRepository memberRepository;
    
    // 코인 충전 처리
    
    @Transactional
    @Override
    public void charge(ChargeCoin chargeCoin) throws Exception {
        Member memberEntity = memberRepository.getById(chargeCoin.getUserNo());
        
        int coin = memberEntity.getCoin();
        int amount = chargeCoin.getAmount();
        
        memberEntity.setCoin(coin + amount);
        
        memberRepository.save(memberEntity);

        chargeCoinRepository.save(chargeCoin);
    }
    
    // 충전 내역 화면
    @Override
    public Object list(Long userNo) throws Exception {
        return chargeCoinRepository.findAll(Sort.by(Sort.Direction.DESC, "historyNo"));
    }
}
