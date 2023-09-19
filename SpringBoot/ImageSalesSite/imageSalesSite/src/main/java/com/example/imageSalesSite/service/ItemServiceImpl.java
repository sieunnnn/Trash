package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.Item;
import com.example.imageSalesSite.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository repository;

    // 등록 처리
    @Override
    public void register(Item item) throws Exception {
        repository.save(item);
    }

    // 상세 화면
    @Override
    public Item read(Long itemId) throws Exception {
        return repository.getById(itemId);
    }

    // 수정 처리
    @Override
    public void modify(Item item) throws Exception {
        Item itemEntity = repository.getById(item.getItemId());

        itemEntity.setItemName(item.getItemName());
        itemEntity.setPrice(item.getPrice());
        itemEntity.setDescription(item.getDescription());
        itemEntity.setPictureUrl(item.getPictureUrl());
        itemEntity.setPreviewUrl(item.getPreviewUrl());

        repository.save(itemEntity);
    }

    // 삭제 처리
    @Override
    public void remove(Long itemId) throws Exception {
        repository.deleteById(itemId);
    }

    // 목록 화면
    @Override
    public List<Item> list() throws Exception {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "itemId"));
    }

    // 미리보기 이미지 표시
    @Override
    public String getPreview(Long itemId) throws Exception {
        Item item = repository.getById(itemId);
        return item.getPreviewUrl();
    }

}