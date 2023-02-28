package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.ChargeCoin;
import com.example.imageSalesSite.domain.Member;
import com.example.imageSalesSite.repository.ChargeCoinRepository;
import com.example.imageSalesSite.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CoinServiceImpl implements CoinService {
    
    private final ChargeCoinRepository chargeCoinRepository;

    // 지급 코인 Repository field
    private final PayCoinRepository payCoinRepository;
    
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

    // 사용자의 상품 구매 내역을 반환한다.
    @Override
    public List<PayCoin> listPayHistory(Long userNo) throws Exception {
        List<Object[]> valueArrays = payCoinRepository.listPayHistory(userNo);

        List<PayCoin> payCoin = new ArrayList<PayCoin>();
        for(Object[] valueArray : valueArrays) {
            PayCoin payCoin = new PayCoin();

            payCoin.setHistoryNo((Long)valueArray[0]);
            payCoin.setUserNo((Long)valueArray[1]);
            payCoin.setItemId((Long)valueArray[2]);
            payCoin.setItemName((String)valueArray[3]);
            payCoin.setAmount((int)valueArray[4]);
            payCoin.setRegDate((LocalDateTime)valueArray[5]);

            payCoinList.add(payCoin);
        }

        return payCoinList;
    }

}
