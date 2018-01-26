package com.zouyun.hello;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        String hello = request.getParameter("hello");

        System.out.println("hellocontroller: "+ hello);
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("hello", hello);

        return mav;
    }
}
