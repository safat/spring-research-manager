package net.therap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/23/14
 * Time: 3:35 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class LogoutController {
    @RequestMapping(value = "/logout")
    public String logout(ModelMap modelMap){
      return "user/login";
    }
}
