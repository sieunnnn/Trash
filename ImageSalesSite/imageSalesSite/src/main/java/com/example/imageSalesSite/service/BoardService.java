package com.example.imageSalesSite.service;

import com.example.imageSalesSite.VO.PageRequestVO;
import com.example.imageSalesSite.domain.Board;
import org.springframework.data.domain.Page;

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

//    // 목록 화면
//    public List<Board> list() throws Exception;

    // 페이징 요청 정보를 매개변수로 받아 페이징 처리를 한 게시글 목록을 반환한다.
    public Page<Board> list(PageRequestVO pageRequestVO) throws Exception;
}
