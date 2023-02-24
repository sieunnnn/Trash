package com.example.imageSalesSite.repository;

import com.example.imageSalesSite.domain.CodeDetail;
import com.example.imageSalesSite.domain.CodeDetailld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CodeDetailRepository extends JpaRepository<CodeDetail, CodeDetailld> {

    @Query("SELECT max(cd.sortSeq) FROM CodeDetail cd WHERE cd.groupCode = ?1")
    public List<Object[]> getMaxSortSeq(String groupCode);

    // 지정된 그룹코드에 해당하는 코드 목록 조회
    @Query("SELECT cd FROM CodeDetail cd WHERE cd.groupCode = ?1")
    public List<CodeDetail> getCodeList(String groupCode);

}
