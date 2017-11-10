package com.critc.plat.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description 系统登录页面
 *
 * @Auther Owen Zhao
 * @Date 11:11 2017/11/10
 */
@RequestMapping("/")
@Controller
public class SysIndexController {

    /**
     * 进入用户管理界面
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/plat/index");
        return mv;
    }
}
