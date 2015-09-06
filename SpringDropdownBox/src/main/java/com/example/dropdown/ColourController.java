package com.example.dropdown;

import com.example.dropdown.model.Colour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
@Controller
@RequestMapping("/colour.htm")
public class ColourController {

    @Autowired
    @Qualifier("colourValidator")
    private Validator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder){
        binder.setValidator(validator);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(Model model){
        Colour colour = new Colour();
        model.addAttribute("colour");
        initModelList(model);
        return "colour";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(Model model, @Validated Colour colour, BindingResult result){
        model.addAttribute("colour", colour);
        String returnValue = "successColour";
        if (result.hasErrors()){
            initModelList(model);
            returnValue = "colour";
        }else {
            model.addAttribute("colour", colour);
        }
        return returnValue;
    }

    private void initModelList(Model model){
        List<String> colourList = new ArrayList<String>();
        colourList.add("red");
        colourList.add("green");
        colourList.add("yellow");
        colourList.add("pink");
        colourList.add("blue");
        model.addAttribute("colours", colourList);
    }
}
