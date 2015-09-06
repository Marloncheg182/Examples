package com.example.hidden;

import com.example.hidden.model.HiddenMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
@Controller
@RequestMapping("/hidden.htm")
public class HiddenController {

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(Model model) {
        HiddenMessage hiddenMessage = new HiddenMessage();
        model.addAttribute("message", hiddenMessage);
        return "hidden";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(Model model, HiddenMessage hiddenMessage, BindingResult result) {
        model.addAttribute("message", hiddenMessage);
        return "successHidden";

    }
}
