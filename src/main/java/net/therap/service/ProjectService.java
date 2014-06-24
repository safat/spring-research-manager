package net.therap.service;

import net.therap.dao.ProjectDao;
import net.therap.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/23/14
 * Time: 4:21 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class ProjectService {

  @Autowired
  @Qualifier("projectDaoJpa")
  private ProjectDao projectDao;

  public Project getProjectById(int projectId){
      return projectDao.getProjectById(projectId);
  }
}
