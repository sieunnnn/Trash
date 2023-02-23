package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.CodeGroup;
import com.example.imageSalesSite.repository.CodeGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CodeGroupServiceImpl implements CodeGroupService{

    private final CodeGroupRepository repository;

    // 등록 처리
    @Override
    public void register(CodeGroup codeGroup) throws Exception {
        repository.save(codeGroup);
    }

    // 목록 화면
    @Override
    public List<CodeGroup> list() throws Exception {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "groupCode"));
    }

    // 상세 화면
    @Override
    public CodeGroup read(String groupCode) throws Exception {
        return repository.getById(groupCode);
    }

    // 수정 처리
    @Override
    public void modify(CodeGroup codeGroup) throws Exception {
        CodeGroup codeGroupEntity = repository.getById(codeGroup.getGroupCode());

        codeGroupEntity.setGroupName(codeGroup.getGroupName());
        repository.save(codeGroupEntity);
    }

    // 삭제 처리
    @Override
    public void remove(String groupCode) throws Exception {
        repository.deleteById(groupCode);
    }
}
