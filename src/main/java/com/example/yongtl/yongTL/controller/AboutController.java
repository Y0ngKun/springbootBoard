package com.example.yongtl.yongTL.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/Features")
public class AboutController {
    @GetMapping
    public ModelAndView about(){
        ModelAndView mav  = new ModelAndView();
        mav.setViewName("Features/Features");
        return mav;
    }
}
