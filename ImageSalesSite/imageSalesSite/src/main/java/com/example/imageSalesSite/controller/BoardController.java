package com.example.imageSalesSite.controller;

import com.example.imageSalesSite.VO.PageRequestVO;
import com.example.imageSalesSite.domain.Board;
import com.example.imageSalesSite.domain.Member;
import com.example.imageSalesSite.dto.PaginationDTO;
import com.example.imageSalesSite.security.domain.CustomUser;
import com.example.imageSalesSite.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/board")
public class BoardController {

    private final BoardService service;

    // 등록 화면
    @GetMapping(value = "/register")
    @PreAuthorize("hasRole('MEMBER')")
    public void registerForm(Model model, Authentication authentication) throws Exception {

        CustomUser customuser = (CustomUser) authentication.getPrincipal();
        Member member = customuser.getMember();

        Board board = new Board();

        board.setWriter(member.getUserId());

        model.addAttribute(board);

    }

    // 등록 처리
    @PostMapping(value = "/register")
    @PreAuthorize("hasRole('MEMBER')")
    public String register(@Validated Board board, BindingResult result, RedirectAttributes rttr) throws Exception {

        if(result.hasErrors()) {
            return "board/register";
        }

        service.register(board);

        rttr.addFlashAttribute("msg","SUCCESS");

        return "redirect:/board/list";
    }

//    // 목록 화면
//    @GetMapping(value = "/list")
//    public void list(Model model) throws Exception {
//        model.addAttribute("list", service.list());
//    }

    // 페이징 요청 정보를 매개변수로 받고 다시 뷰에 전달한다.
    @GetMapping(value = "/list")
    public void list(@ModelAttribute("pgrq") PageRequestVO pageRequestVO, Model model) throws Exception {
        Page<Board> page = service.list(pageRequestVO);

        model.addAttribute("pgntn", new PaginationDTO<Board>(page));
    }

//    // 상세 화면
//    @GetMapping(value = "/read")
//    public void read(Long boardNo, Model model) throws Exception {
//        model.addAttribute(service.read(boardNo));
//    }

    // 페이징 요청 정보를 매개변수로 받고 다시 뷰에 전달한다.
    @GetMapping(value = "/read")
    public void read(Long boardNo, @ModelAttribute("parq") PageRequestVO pageRequestVO, Model model) throws Exception {
        model.addAttribute(service.read(boardNo));
    }

//    // 삭제 처리
//    @PostMapping(value = "/remove")
//    @PreAuthorize("(hasRole('MEMBER') and principal.username == #writer) or hasRole('ADMIN')")
//    public String remove(Long boardNo, RedirectAttributes rttr, String writer) throws Exception {
//
//        service.remove(boardNo);
//
//        rttr.addFlashAttribute("msg", "SUCCESS");
//
//        return "redirect:/board/list";
//    }

    // 페이징 요청 정보를 매개변수로 받고 다시 뷰에 전달한다.
    @PostMapping(value = "/remove")
    @PreAuthorize("(hasRole('MEMBER') and principal.username == #writer)or hasRole('ADMIN')")
    public String remove(Long boardNo, PageRequestVO pageRequestVO, RedirectAttributes rttr, String writer) throws Exception {

        service.remove(boardNo);

        rttr.addFlashAttribute("page", pageRequestVO.getPage());
        rttr.addFlashAttribute("sizePerPage",pageRequestVO.getSizePerPage());

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/board/list";
    }

//    // 수정 화면
//    @GetMapping("/modify")
//    @PreAuthorize("hasRole('MEMBER')")
//    public void modifyForm(Long boardNo, Model model) throws Exception {
//        model.addAttribute(service.read(boardNo));
//    }

    // 페이징 요청 정보를 매개변수로 받고 다시 뷰에 전달한다.
    @GetMapping(value = "/modify")
    @PreAuthorize("hasRole('MEMBER')")
    public void modifyForm(Long boardNo, @ModelAttribute("pgrq")PageRequestVO pageRequestVO, Model model) throws Exception {
        model.addAttribute(service.read(boardNo));
    }

//    // 수정 처리
//    @PostMapping("/modify")
//    @PreAuthorize("hasRole('MEMBER') and principal.username == #board.writer")
//    public String modify(@Validated Board board, BindingResult result, RedirectAttributes rttr) throws Exception {
//
//        if(result.hasErrors()) {
//            return "board/modify";
//        }
//
//        service.modify(board);
//
//        rttr.addFlashAttribute("msg", "SUCCESS");
//
//        return "redirect:/board/list";
//    }

    @PreAuthorize("hasRole('MEMBER') and principal.username == #board.writer")
    public String modify(@Validated Board board, BindingResult result, @ModelAttribute("pgrq")
    PageRequestVO pageRequestVO, RedirectAttributes rttr) throws Exception {

        if (result.hasErrors()) {
            return "board/modify";
        }

        service.modify(board);

        rttr.addAttribute("page", pageRequestVO.getPage());
        rttr.addAttribute("sizePerPage", pageRequestVO.getSizePerPage());

        rttr.addFlashAttribute("msg", "SUCCESS");

        return "redirect:/board/list";
    }
}
