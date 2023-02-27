package com.example.imageSalesSite.service;

import com.example.imageSalesSite.VO.PageRequestVO;
import com.example.imageSalesSite.domain.Board;
import com.example.imageSalesSite.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


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
        return repository.getById(boardNo);
    }

    // 수정 처리
    @Override
    public void modify(Board board) throws Exception {
        Board boardEntity = repository.getById(board.getBoardNo());

        boardEntity.setTitle(board.getTitle());
        boardEntity.setContent(board.getContent());

        repository.save(boardEntity);
    }

    // 삭제 처리
    @Override
    public void remove(Long boardNo) throws Exception {
        repository.deleteById(boardNo);
    }

//    // 목록 화면
//    @Override
//    public List<Board> list() throws Exception {
//        return repository.findAll(Sort.by(Sort.Direction.DESC, "boardNo"));
//    }

    // 페이징 요청 정보를 매개변수로 받아 페이징 처리를 한 게시글 목록을 반환한다.
    @Override
    public Page<Board> list(PageRequestVO pageRequestVO) throws Exception {
//        int pageNumber = pageRequestVO.getPage() -1;
//        int sizePerPage = pageRequestVO.getSizePerPage();
//
//        Pageable pageRequest = PageRequest.of(pageNumber, sizePerPage, Sort.Direction.DESC, "boardNo");
//
//        Page<Board> page = repository.findAll(pageRequest);
//
//        return page;

        // 검색 유형과 검색어로 검색된 게시글을 페이지 단위로 반환한다.
        String searchType = pageRequestVO.getSearchType();
        String keyword = pageRequestVO.getKeyword();

        int pageNumber = pageRequestVO.getPage() -1;
        int sizePerPage = pageRequestVO.getSizePerPage();

        Pageable pageRequest = PageRequest.of(pageNumber, sizePerPage, Sort.Direction.DESC, "boardNo");

        return repository.getSearchPage(searchType, keyword, pageRequest);
    }

}