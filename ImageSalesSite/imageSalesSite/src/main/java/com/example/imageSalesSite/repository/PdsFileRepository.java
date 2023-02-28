package com.example.imageSalesSite.repository;

import com.example.imageSalesSite.domain.PdsFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PdsFileRepository extends JpaRepository<PdsFile, Long> {

    // 첨부파일 다운로드 처리
    public List<PdsFile> findByFullName(String fullName);
}
