package com.example.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller2 {

    @RequestMapping("login")
    public ModelAndView showLoginForm(LogInBean s1) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("LogIn");
        return mv;
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ModelAndView disp(LogInBean s1) {
        ModelAndView obj = new ModelAndView();
        
        if ("Sadanand".equals(s1.getName()) && "123456".equals(s1.getPass())) {
            obj.addObject("obj", s1);
            obj.setViewName("Welcome");
        } else {
            obj.addObject("error", "Invalid name or password");
            obj.setViewName("LogIn");
        }

        return obj;
    }

}