package com.example.controller;

import com.example.delegate.LoginDelegate;
import com.example.viewBean.LoginBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginDelegate loginDelegate;

    @RequestMapping(value = "/login", method = RequestMethod.GET )
    public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response)
    {
        ModelAndView model= new ModelAndView("login");
        LoginBean loginBean = new LoginBean();
        model.addObject("loginBean", loginBean);
        return model;
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean")LoginBean loginBean){
        ModelAndView model = null;
        try {
            boolean isValidUser = loginDelegate.isValidatorUser(loginBean.getUsername(),
                    loginBean.getPassword());
            if (isValidUser)
            {
                System.out.println("User Login Successful!");
                request.setAttribute("loggedUser", loginBean.getUsername());
                model = new ModelAndView("welcom");

            }
            else {
                model = new ModelAndView("login");
                model.addObject("loginBean", loginBean);
                request.setAttribute("message", "Invalid user!");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return model;
    }
}
