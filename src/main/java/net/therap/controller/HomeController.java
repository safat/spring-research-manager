package net.therap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/23/14
 * Time: 2:31 PM
 *
 */
@Controller
public class HomeController {
    @RequestMapping (value = "/home", method = RequestMethod.GET)
    public String getHomePage(ModelMap modelMap) {
        return "home";
    }
}
