package net.therap.dao.jpa;

import net.therap.dao.SupervisorDao;
import net.therap.domain.Project;
import net.therap.domain.Supervisor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/24/14
 * Time: 11:14 AM
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Qualifier("supervisorDaoJpa")
public class SupervisorDaoImpl implements SupervisorDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Project> getProjectListBySupervisorId(int supervisorId) {
        Supervisor supervisor = entityManager.find(Supervisor.class, supervisorId);
        return supervisor.getProjectList();
    }
}
