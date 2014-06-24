package net.therap.controller;

import net.therap.domain.Project;
import net.therap.service.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/24/14
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/supervisor")
public class SupervisorController {
    @Autowired
    private SupervisorService supervisorService;

    @RequestMapping(value = "/{id}/runningProjects", method = RequestMethod.GET)
    public String projectList(@PathVariable("id") int supervisorId, ModelMap modelMap){
        List<Project> projectList = supervisorService.getProjectListBySupervisorId(supervisorId);
        modelMap.addAttribute("projectList", projectList);
//        System.out.println("project list : "+projectList.get(0).toString());
        return "project/projectList";
    }

}
