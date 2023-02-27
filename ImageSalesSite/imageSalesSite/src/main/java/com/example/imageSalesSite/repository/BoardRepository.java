package com.example.imageSalesSite.repository;

import com.example.imageSalesSite.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

//public interface BoardRepository extends JpaRepository<Board, Long> {
//}

public interface BoardRepository extends JpaRepository<Board, Long>, CustomBoardRepository {
}
