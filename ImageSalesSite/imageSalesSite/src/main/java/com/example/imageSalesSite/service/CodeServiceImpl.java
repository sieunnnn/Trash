package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.CodeDetail;
import com.example.imageSalesSite.domain.CodeDetailld;
import com.example.imageSalesSite.domain.CodeGroup;
import com.example.imageSalesSite.dto.CodeLabelValue;
import com.example.imageSalesSite.repository.CodeDetailRepository;
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

    // 코드 정보 제공
    private final CodeDetailRepository codeDetailRepository;

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

    // 지정된 그룹코드에 해당하는 코드 목록 조회
    @Override
    public List<CodeLabelValue> getCodeList(String groupCode) throws Exception {

        List<CodeDetail> codeDetails = codeDetailRepository.getCodeList(groupCode);

        List<CodeLabelValue> codeList = new ArrayList<CodeLabelValue>();

        for(CodeDetail codeDetail : codeDetails) {
            codeList.add(new CodeLabelValue(codeDetail.getCodeValue(), codeDetail.getCodeName()));
        }

        return codeList;
    }

}
