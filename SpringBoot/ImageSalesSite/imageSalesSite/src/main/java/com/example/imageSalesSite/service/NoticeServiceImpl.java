package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.Notice;
import com.example.imageSalesSite.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NoticeServiceImpl implements NoticeService {

    private final NoticeRepository repository;

    // 등록 처리
    @Override
    public void register(Notice notice) throws Exception {
        repository.save(notice);
    }

    // 상세 화면
    @Override
    public Notice read(Long noticeNo) throws Exception {
        return repository.getById(noticeNo);
    }

    // 수정 처리
    @Override
    public void modify(Notice notice) throws Exception {
        Notice noticeEntity = repository.getById(notice.getNoticeNo());

        noticeEntity.setTitle(notice.getTitle());

        repository.save(noticeEntity);
    }

    // 삭제 처리
    @Override
    public void remove(Long noticeNo) throws Exception {
        repository.deleteById(noticeNo);
    }

    // 목록 화면
    @Override
    public List<Notice> list() throws Exception {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "noticeNo"));
    }

}