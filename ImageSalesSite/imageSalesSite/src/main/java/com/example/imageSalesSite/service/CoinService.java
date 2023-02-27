package com.example.imageSalesSite.service;

public class CoinService {

    // 코인 충전 처리
    public void charge(ChargeCoin chargeCoin) throws Exception;

    // 충전 내역 화면
    public List<ChargeCoin> list(Long userNo) throws Exception;

}
