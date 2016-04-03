package oa.pavlenko.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping(name = "/test", method = RequestMethod.GET)
    public String index(ModelMap model){
        model.put("mes", "test-mess Spring");
        return "test";
    }
}
