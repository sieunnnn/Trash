package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.CodeDetail;
import com.example.imageSalesSite.domain.CodeDetailId;
import com.example.imageSalesSite.repository.CodeDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CodeDetailServiceImpl implements CodeDetailService{

    private final CodeDetailRepository repository;

    // 등록 처리
    @Override
    public void register(CodeDetail codeDetail) throws Exception {
        String groupCode = codeDetail.getGroupCode();
        List<Object[]> rsList = repository.getMaxSortSeq(groupCode);

        Integer maxSortSeq = 0;
        if(rsList.size() > 0) {
            Object[] maxValues = rsList.get(0);
            System.out.println(maxValues);
            if(maxValues != null && maxValues.length > 0) {
                maxSortSeq = (Integer)maxValues[0];
            }
        }

        codeDetail.setSortSeq(maxSortSeq + 1);

        repository.save(codeDetail);
    }

    // 목록 화면
    @Override
    public List<CodeDetail> list() throws Exception {
        return repository.findAll(Sort.by(Sort.Direction.ASC, "groupCode", "codeValue"));
    }

    // 상세 화면
    @Override
    public CodeDetail read(CodeDetail codeDetail) throws Exception {

        CodeDetailId codeDetailId = new CodeDetailId();
        codeDetailId.setGroupCode(codeDetail.getGroupCode());
        codeDetailId.setCodeValue(codeDetail.getCodeValue());

        return repository.getById(codeDetailId);
    }

    // 수정 처리
    @Override
    public void modify(CodeDetail codeDetail) throws Exception {

        CodeDetailId codeDetailId = new CodeDetailId();
        codeDetailId.setGroupCode(codeDetail.getGroupCode());
        codeDetailId.setCodeValue(codeDetail.getCodeValue());

        CodeDetail codeDetailEntity = repository.getById(codeDetailId);

        codeDetailEntity.setCodeValue(codeDetail.getCodeValue());
        codeDetailEntity.setCodeName(codeDetail.getCodeName());

        repository.save(codeDetailEntity);

    }

    // 삭제 처리
    @Override
    public void remove(CodeDetail codeDetail) throws Exception {

        CodeDetailId codeDetailId = new CodeDetailId();
        codeDetailId.setGroupCode(codeDetail.getGroupCode());
        codeDetailId.setCodeValue(codeDetail.getCodeValue());

        repository.deleteById(codeDetailId);
    }

}
