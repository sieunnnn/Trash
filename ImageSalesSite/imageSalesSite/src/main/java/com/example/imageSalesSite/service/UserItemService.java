package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.Item;
import com.example.imageSalesSite.domain.Member;

public interface UserItemService {

    // 등록 처리
    public void register(Member member, Item item) throws Exception;

    // 구매 상품 보기
    public Object read(Long userItemNo) throws Exception;

    // 사용자 구매 상품 목록
    public Object list(Long userNo) throws Exception;

}
