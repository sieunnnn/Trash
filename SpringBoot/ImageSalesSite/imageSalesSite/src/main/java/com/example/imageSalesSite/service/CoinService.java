package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.ChargeCoin;

public interface CoinService {

    // 코인 충전 처리
    public void charge(ChargeCoin chargeCoin) throws Exception;

    // 충전 내역 화면
    public Object list(Long userNo) throws Exception;

    // 사용자의 상품 구매 내역을 반환한다.
    public Object listPayHistory(Long userNo) throws Exception;

}
