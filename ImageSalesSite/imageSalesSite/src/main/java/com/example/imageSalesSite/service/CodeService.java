package com.example.imageSalesSite.service;

import com.example.imageSalesSite.dto.CodeLabelValue;

import java.util.List;

public interface CodeService {

    // 코드 그룹 목록
    public List<CodeLabelValue> getGroupCodeList() throws Exception;
}
