package com.example.imageSalesSite.repository;

import com.example.imageSalesSite.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}