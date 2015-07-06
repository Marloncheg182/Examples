package com.springapp.mvc;

import mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping(value = "/valid")
    public String printWelcome(Model m) {
        m.addAttribute("user", new User());
        return "hello";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(@Valid User user, BindingResult result, Model m)
    {
        if(result.hasErrors())
        {
            return "hello";
        }
        m.addAttribute("message","Successfully saved User!");
        return "hello";
    }
}