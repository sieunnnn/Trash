package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.Board;
import com.example.imageSalesSite.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl  implements BoardService{

    private final BoardRepository repository;

    // 등록 처리
    @Override
    public void register(Board board) throws Exception {
        repository.save(board);
    }

    // 상세 화면
    @Override
    public Board read(Long boardNo) throws Exception {
        return repository.getOne(boardNo);
    }

    // 수정 처리
    @Override
    public void modify(Board board) throws Exception {
        Board boardEntity = repository.getOne(board.getBoardNo());

        boardEntity.setTitle(board.getTitle());
        boardEntity.setContent(board.getContent());

        repository.save(boardEntity);
    }

    // 삭제 처리
    @Override
    public void remove(Long boardNo) throws Exception {
        repository.deleteById(boardNo);
    }

    // 목록 화면
    @Override
    public List<Board> list() throws Exception {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "boardNo"));
    }

}