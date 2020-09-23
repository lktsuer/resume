package com.lktsuer.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: djh
 * @date: 2020/9/22 21:10
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("index1");
        return mv;
    }

    @GetMapping("/1")
    public ModelAndView index1(ModelAndView mv){
        mv.setViewName("index1");
        return mv;
    }
    @GetMapping("/2")
    public ModelAndView index2(ModelAndView mv){
        mv.setViewName("index2");
        return mv;
    }
}
