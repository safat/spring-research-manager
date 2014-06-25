package net.therap.dao.jpa;

import net.therap.dao.SupervisorDao;
import net.therap.domain.Project;
import net.therap.domain.Supervisor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

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
    @Cacheable(value = "supervisorProjectCache")
    public Collection<Project> getProjectListBySupervisorId(int supervisorId) {
        Supervisor supervisor = entityManager.find(Supervisor.class, supervisorId);
        System.out.println("\n\nSupervisorDao : getProjectListBySupervisorId ");
        return supervisor.getProjectList();
    }
}
