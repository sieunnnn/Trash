package com.example.imageSalesSite.service;

import com.example.imageSalesSite.dto.CodeLabelValue;

import java.util.List;

public interface CodeService {

    // 코드 그룹 목록
    public List<CodeLabelValue> getGroupCodeList() throws Exception;

    // 지정된 그룹코드에 해당하는 코드 목록 조회
    public List<CodeLabelValue> getCodeList(String groupCode) throws Exception;
}
