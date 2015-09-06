package hidden.controller;

import hidden.model.HiddenMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
@Controller
@RequestMapping("/hidden.html")
public class HiddenController {

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(Model model){
    HiddenMessage message = new HiddenMessage() ;
        model.addAttribute("message", message);
        return "hidden";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(Model model, HiddenMessage message, BindingResult result){
    model.addAttribute("message" + message);
        return "successHidden";
    }

}
