package com.example.imageSalesSite.repository;


import com.example.imageSalesSite.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
