package com.example.imageSalesSite.controller;

import com.example.imageSalesSite.common.util.UploadFileUtils;
import com.example.imageSalesSite.domain.Pds;
import com.example.imageSalesSite.prop.ShopProperties;
import com.example.imageSalesSite.service.PdsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/pds")
public class PdsController {

    private final PdsService pdsService;

    private final ShopProperties shopProperties;

    // 목록 화면
    @GetMapping("/list")
    public void list(Model model) throws Exception {
        List<Pds> itemList = this.pdsService.list();

        model.addAttribute("itemList", itemList);
    }

    // 등록 화면
    @GetMapping("/register")
    @PreAuthorize("hasRole('ADMIN')")
    public String registerForm(Model model) {
        model.addAttribute(new Pds());

        return "pds/register";
    }

    // 등록 처리
    @PostMapping("/register")
    @PreAuthorize("hasRole('ADMIN')")
    public String register(@Validated Pds pds, BindingResult result, RedirectAttributes rttr) throws Exception {
        if(result.hasErrors()) {
            return "pds/register";
        }

        this.pdsService.register(pds);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/pds/list";
    }

    // 상세 화면
    @GetMapping("/read")
    public String read(Long itemId, Model model) throws Exception {
        Pds pds = this.pdsService.read(itemId);

        model.addAttribute(pds);

        return "pds/read";
    }

    // 수정 화면
    @GetMapping("/modify")
    @PreAuthorize("hasRole('ADMIN')")
    public String modifyForm(Long itemId, Model model) throws Exception {
        Pds pds = this.pdsService.read(itemId);

        model.addAttribute(pds);

        return "pds/modify";
    }

    // 수정 처리
    @PostMapping("/modify")
    @PreAuthorize("hasRole('ADMIN')")
    public String modify(@Validated Pds pds, BindingResult result, RedirectAttributes rttr) throws Exception {
        if(result.hasErrors()) {
            return "pds/modify";
        }

        this.pdsService.modify(pds);

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/pds/list";
    }

    // 삭제 화면
    @GetMapping("/remove")
    @PreAuthorize("hasRole('ADMIN')")
    public String removeForm(Long itemId, Model model) throws Exception {
        Pds pds = this.pdsService.read(itemId);

        model.addAttribute(pds);

        return "pds/remove";
    }

    // 삭제 처리
    @PostMapping("/remove")
    @PreAuthorize("hasRole('ADMIN')")
    public String remove(Pds pds, RedirectAttributes rttr) throws Exception {
        this.pdsService.remove(pds.getItemId());

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/pds/list";
    }
    // 첨부파일 업로드 처리
    @ResponseBody
    @PostMapping(value = "/uploadAjax", produces = "text/plain;charset=UTF-8")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> uploadAjax(MultipartFile file) throws Exception {
        String savedName = UploadFileUtils.uploadFile(shopProperties.getUploadPath(), file.getOriginalFilename(), file.getBytes());

        return new ResponseEntity<String>(savedName, HttpStatus.CREATED);
    }

    // 첨부파일 다운로드 처리
    @ResponseBody
    @GetMapping("/downloadFile")
    public ResponseEntity<byte[]> downloadFile(String fullName) throws Exception {
        ResponseEntity<byte[]> entity = null;

        pdsService.updateAttachDownCnt(fullName);

        try {
            HttpHeaders headers = new HttpHeaders();

            File file = new File(shopProperties.getUploadPath() + fullName);

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

    // 첨부파일 삭제 처리
    @ResponseBody
    @PostMapping("/deleteFile")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> deleteFile(String fileName) {
        new File(shopProperties.getUploadPath() + fileName.replace('/', File.separatorChar)).delete();

        return new ResponseEntity<String>("deleted", HttpStatus.OK);
    }

    // 첨부파일 목록 처리
    @ResponseBody
    @GetMapping("/getAttach/{itemId}")
    public List<String> getAttach(@PathVariable("itemId") Long itemId) throws Exception {
        return pdsService.getAttach(itemId);
    }

}

