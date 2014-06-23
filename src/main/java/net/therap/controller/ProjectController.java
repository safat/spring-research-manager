package net.therap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/23/14
 * Time: 3:38 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "project")
public class ProjectController {

    @RequestMapping(value = "/runningProjects/{id}")
    public String showProjectList(){
       return "project/projectList";
    }
    @RequestMapping(value = "/addResearchPaperForm", method = RequestMethod.GET)
    public String addResearchPaper(ModelMap modelMap){
      return "project/addResearchPaperForm";
    }

    @RequestMapping(value = "/uploadResearchPaper", method = RequestMethod.POST)
    public void uploadResearchPaper(ModelMap modelMap){
        System.out.println("uploading research paper into database..");
    }
}
