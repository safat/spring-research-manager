package net.therap.service;

import net.therap.dao.SupervisorDao;
import net.therap.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/24/14
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class SupervisorService {

    @Autowired
    @Qualifier("supervisorDaoJpa")
    SupervisorDao supervisorDao;

    public Collection<Project> getProjectListBySupervisorId(int supervisorId){
      return supervisorDao.getProjectListBySupervisorId(supervisorId);
    }
}
