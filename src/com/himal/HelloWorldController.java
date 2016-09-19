package com.himal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Himal Acharya on 2016-09-19.
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
        ModelAndView modelAndView = new ModelAndView("Hello");
        modelAndView.addObject("msg", "Hello World!!!!");
        return modelAndView;

    }
}
