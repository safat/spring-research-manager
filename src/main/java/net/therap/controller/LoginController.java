package net.therap.controller;

import net.therap.domain.User;
import net.therap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping (value = "/login", method = RequestMethod.GET)
    public String getLoginForm(ModelMap modelMap) {
        modelMap.addAttribute("user", new User());
        return "user/login";
    }

    @RequestMapping (value = "/login", method = RequestMethod.POST)
    public String loginInfoVerification(@ModelAttribute User user, ModelMap modelMap) {
        if (userService.isValidUser(user)) {
            System.out.println(user);
            return "redirect: home";
        } else {
            modelMap.addAttribute("message", "login failed");
            return "user/login";
        }

    }
}