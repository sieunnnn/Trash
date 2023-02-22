package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.CodeDetail;
import com.example.imageSalesSite.domain.CodeDetailld;
import com.example.imageSalesSite.domain.CodeGroup;
import com.example.imageSalesSite.dto.CodeLabelValue;
import com.example.imageSalesSite.repository.CodeGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CodeServiceImpl implements CodeService{

    private final CodeGroupRepository repository;

    // 등록 화면
    @Override
    public List<CodeLabelValue> getGroupCodeList() throws Exception {

        List<CodeGroup> codeGroups = repository.findAll(Sort.by(Sort.Direction.ASC, "groupCode"));
        List<CodeLabelValue> codeGroupList = new ArrayList<CodeLabelValue>();

        for(CodeGroup codeGroup: codeGroups) {
            codeGroupList.add(new CodeLabelValue(codeGroup.getGroupCode(), codeGroup.getGroupName()));
        }

        return codeGroupList;

    }


}
