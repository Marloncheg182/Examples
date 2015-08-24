package rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import rest.domain.MyDataObject;

import java.util.Calendar;

/**
 * Created by Oleg Romanenchuk on 8/17/2015.
 */
@Controller
@RequestMapping(value = "/myservice")
public class MainController {

    @RequestMapping(value = "/{time}", method = RequestMethod.GET)
    @ResponseBody
    public MyDataObject getMyData(@PathVariable long time) {
        return new MyDataObject(Calendar.getInstance(), "GET response!");
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public MyDataObject putMyData(){
        return new MyDataObject(Calendar.getInstance(), "PUT response!");
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public MyDataObject postMyData() {
        return new MyDataObject(Calendar.getInstance(), "POST response!");
    }

    @RequestMapping(value = "/{time}", method = RequestMethod.DELETE)
    @ResponseBody
    public MyDataObject deleteMyData(@PathVariable long time){
        return new MyDataObject(Calendar.getInstance(), "DELETE response!");
    }
}
