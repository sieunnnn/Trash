package com.example.imageSalesSite.service;

import com.example.imageSalesSite.domain.Pds;
import com.example.imageSalesSite.domain.PdsFile;
import com.example.imageSalesSite.repository.PdsFileRepository;
import com.example.imageSalesSite.repository.PdsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PdsServiceImpl implements PdsService {

    private final PdsRepository repository;

    private final PdsFileRepository pdsFileRepository;

    // 등록 처리
    @Override
    public void register(Pds pds) throws Exception {
        Pds pdsEntity = new Pds();

        pdsEntity.setItemName(pds.getItemName());
        pdsEntity.setDescription(pds.getDescription());

        String[] files = pds.getFiles();

        if (files == null) {
            return;
        }

        for (String fileName : files) {
            PdsFile pdsFile = new PdsFile();
            pdsFile.setFullName(fileName);

            pdsEntity.addItemFile(pdsFile);
        }

        repository.save(pdsEntity);
    }

    // 상세 화면
    @Override
    public Pds read(Long itemId) throws Exception {
        Pds pdsEntity = repository.getById(itemId);
        Integer viewCnt = pdsEntity.getViewCnt();

        if(viewCnt == null) {
            viewCnt = 0;
        }

        pdsEntity.setViewCnt(viewCnt + 1);

        repository.save(pdsEntity);

        return repository.getById(itemId);
    }


    // 수정 처리
    @Override
    public void modify(Pds pds) throws Exception {
        Pds pdsEntity = repository.getById(pds.getItemId());

        pdsEntity.setItemName(pds.getItemName());
        pdsEntity.setDescription(pds.getDescription());

        String[] files = pds.getFiles();

        if (files != null) {
            pdsEntity.clearItemFile();

            for (String fileName : files) {
                PdsFile pdsFile = new PdsFile();
                pdsFile.setFullName(fileName);

                pdsEntity.addItemFile(pdsFile);
            }
        }
        repository.save(pdsEntity);
    }

    // 삭제 처리
    @Override
    public void remove(Long itemId) throws Exception {
        repository.deleteById(itemId);
    }

    // 목록 화면
    @Override
    public List<Pds> list() throws Exception {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "itemId"));
    }

    // 첨부파일 목록 처리
    @Override
    public List<String> getAttach(Long itemId) throws Exception {
        Pds pdsEntity = repository.getById(itemId);

        List<PdsFile> pdsFiles = pdsEntity.getPdsFiles();

        List<String> attachList = new ArrayList<String>();
        for(PdsFile pdsFile : pdsFiles) {
            attachList.add(pdsFile.getFullName());
        }

        return attachList;
    }

    // 첨부파일 다운로드 처리
    @Override
    public void updateAttachDownCnt(String fullName) throws Exception {
        List<PdsFile> pdsFileList = pdsFileRepository.findByFullName(fullName);

        if(pdsFileList.size() > 0) {
            PdsFile pdsFileEntity = pdsFileList.get(0);

            Integer downCnt = pdsFileEntity.getDownCnt();
            if(downCnt == null) {
                downCnt = 0;
            }
            pdsFileEntity.setDownCnt(downCnt + 1);

            pdsFileRepository.save(pdsFileEntity);
        }
    }

}