package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.Board;

import java.util.List;

public interface BoardService {

    // 등록 처리
    public void register(Board board) throws Exception;

    // 상세 화면
    public Board read(Long boardNo) throws Exception;

    // 수정 처리
    public void modify(Board board) throws Exception;

    // 삭제 처리
    public void remove(Long boardNo) throws Exception;

    // 목록 화면
    public List<Board> list() throws Exception;
}
