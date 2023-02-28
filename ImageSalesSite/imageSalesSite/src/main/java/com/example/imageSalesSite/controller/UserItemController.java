package com.example.imageSalesSite.controller;

import com.example.imageSalesSite.domain.Member;
import com.example.imageSalesSite.domain.UserItem;
import com.example.imageSalesSite.prop.ShopProperties;
import com.example.imageSalesSite.security.domain.CustomUser;
import com.example.imageSalesSite.service.UserItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/useritem")
public class UserItemController {

    private final UserItemService service;
    private final ShopProperties shopProperties;

    // 사용자 구매 상품 목록
    @GetMapping(value = "/list")
    @PreAuthorize("hasAnyRole('ADMIN', 'MEMBER')")
    public void list(Model model, Authentication authentication) throws Exception {
        CustomUser customUser = (CustomUser) authentication.getPrincipal();
        Member member = customUser.getMember();

        Long userNo = member.getUserNo();

        model.addAttribute("list", service.list(userNo));
    }

    // 구매 상품 보기
    @GetMapping(value = "/read")
    @PreAuthorize("hasAnyRole('ADMIN', 'MEMBER')")
    public void read(Long userItemNo, Model model) throws Exception {
        model.addAttribute(service.read(userItemNo));
    }

    // 구매 상품 다운 로드
    @ResponseBody
    @GetMapping("/download")
    @PreAuthorize("hasAnyRole('ADMIN','MEMBER')")
    public ResponseEntity<byte[]> download(Long userItemNo, Authentication authentication) throws Exception {
        // UserItem userItem = service.read(userItemNo); 일때  Object 로 인식되서 cast 함
        UserItem userItem = (UserItem) service.read(userItemNo);

        String fullName = userItem.getPictureUrl();

        ResponseEntity<byte[]> entity = null;

        try {
            HttpHeaders headers = new HttpHeaders();

            File file = new File(shopProperties.getUploadPath() + File.separator + fullName);

            String fileName = fullName.substring(fullName.indexOf("_") + 1);

            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.add("Content-Disposition", "attachment; filename=\"" + new String(fileName.getBytes("UTF-8"), "ISO-8859-1") + "\"");


            entity = new ResponseEntity<byte[]>(FileCopyUtils.copyToByteArray(file), headers, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
        }

        return entity;
    }

}
