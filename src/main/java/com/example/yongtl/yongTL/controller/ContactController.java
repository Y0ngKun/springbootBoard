package com.example.yongtl.yongTL.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @GetMapping
    public ModelAndView contact(){
        ModelAndView mav  = new ModelAndView();
        mav.setViewName("contact/contact");
        return mav;
    }
}
