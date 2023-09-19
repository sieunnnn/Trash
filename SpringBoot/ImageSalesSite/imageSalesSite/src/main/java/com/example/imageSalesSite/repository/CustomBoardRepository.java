package com.example.imageSalesSite.repository;

import com.example.imageSalesSite.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomBoardRepository {

    // 목록 화면
    public Page<Board> getSearchPage(String type, String keyword, Pageable pageable);
}
