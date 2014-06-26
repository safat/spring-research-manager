package net.therap.controller;

import net.therap.domain.Project;
import net.therap.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @Author: shakhawat.hossain
 * Date: 6/23/14
 * Time: 3:38 PM
 *
 */
@Controller
@RequestMapping(value = "project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/runningProjects")
    public String showRunningProjectList(ModelMap modelMap){
       List<Project> runningProjectList = projectService.getRunningProjects();
       modelMap.addAttribute("title", "Running Projects");
       modelMap.addAttribute("projectList", runningProjectList);
       return "project/projectList";
    }

    @RequestMapping(value = "/addResearchPaperForm", method = RequestMethod.GET)
    public String addResearchPaper(){
      return "project/addResearchPaperForm";
    }

    @RequestMapping(value = "details/{id}")
    public String getProjectDetails(@PathVariable("id") int projectId, ModelMap modelMap){
        System.out.println("show details of project : "+projectId);
        Project project = projectService.getProjectById(projectId);
        modelMap.addAttribute("project", project);
        return "project/details";
    }

    @RequestMapping(value = "/update/{id}")
    public String updateProject(@PathVariable("id") int projectId, ModelMap modelMap){
        System.out.println("updating project : "+projectId);
        projectService.updateProject(projectId);
        return "project/updateSuccess";
    }


}
