package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.Pds;

import java.util.List;

public interface PdsService {

    // 등록 처리
    public void register(Pds item) throws Exception;

    // 상세 화면
    public Pds read(Long itemId) throws Exception;

    // 수정 처리
    public void modify(Pds item) throws Exception;

    // 삭제 처리
    public void remove(Long itemId) throws Exception;

    // 목록 화면
    public List<Pds> list() throws Exception;

    // 첨부파일 목록 처리
    public List<String> getAttach(Long itemId) throws Exception;

    // 첨부파일 다운로드 처리
    public void updateAttachDownCnt(String fullName) throws Exception;

}
