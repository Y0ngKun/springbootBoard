package com.example.yongtl.yongTL.controller;

import com.example.yongtl.yongTL.entity.Board;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/list")
    public ModelAndView board(){
        ModelAndView mav  = new ModelAndView();
        mav.setViewName("board/board");
        return mav;
    }

    @GetMapping("/write")
    public ModelAndView write(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("board/write");
        return mav;
    }

    @PostMapping("/write")
    public ModelAndView write(Board Board){
        ModelAndView mav = new ModelAndView();

        mav.setViewName("/board");
        return mav;
    }

}
