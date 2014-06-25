package net.therap.controller;

import net.therap.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created with IntelliJ IDEA.
 * @Author: shakhawat.hossain
 * Date: 6/23/14
 * Time: 10:06 AM
 *
 */
@Controller
@RequestMapping (value = "/user")
public class UserController {

    @RequestMapping (value = "/new", method = RequestMethod.GET)
    public String initRegistrationForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user/addOrUpdateUser";
    }

    @RequestMapping (value = "/add", method = RequestMethod.POST)
    public String addUser(@Valid User user, BindingResult bindingResult, ModelMap modelMap) {
        System.out.println(bindingResult.hasErrors()+" "+user.toString());
        System.out.println("total erros : "+bindingResult.getFieldErrorCount());
        if(bindingResult.hasErrors()){
           return "user/addOrUpdateUser";
        }

       return "redirect:user/details/1";
    }

    @RequestMapping(value = "/details/{id}", method = RequestMethod.POST)
    public String getUserById(@RequestParam String id, ModelMap modelMap){
       return "user/userDetails";
    }


}
