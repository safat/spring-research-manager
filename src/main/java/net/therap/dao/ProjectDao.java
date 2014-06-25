package net.therap.dao;

import net.therap.domain.Project;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/24/14
 * Time: 12:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ProjectDao {
 public Project getProjectById(int projectId);
 public List<Project> getRunningProjects();
}
