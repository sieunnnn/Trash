package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.Notice;

import java.util.List;

public interface NoticeService {

    // 등록 처리
    public void register(Notice notice) throws Exception;

    // 상세 화면
    public Notice read(Long noticeNo) throws Exception;

    // 수정 처리
    public void modify(Notice notice) throws Exception;

    // 삭제 처리
    public void remove(Long noticeNo) throws Exception;

    // 목록 화면
    public List<Notice> list() throws Exception;
}
