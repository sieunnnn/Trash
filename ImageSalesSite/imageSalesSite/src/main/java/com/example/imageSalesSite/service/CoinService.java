package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.ChargeCoin;

public interface CoinService {

    // 코인 충전 처리
    public void charge(ChargeCoin chargeCoin) throws Exception;

    // 충전 내역 화면
    public Object list(Long userNo) throws Exception;

}
