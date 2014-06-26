package net.therap.dao.jpa;

import net.therap.dao.SupervisorDao;
import net.therap.domain.Project;
import net.therap.domain.Supervisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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

    @Autowired
    public CacheManager cacheManager;


    @Override
    @Cacheable(value = "project" )
    public Collection<Project> getProjectListBySupervisorId(int supervisorId) {
//        Supervisor supervisor = entityManager.find(Supervisor.class, supervisorId);
//        System.out.println("\n\nSupervisorDao :cachebale method--> getProjectListBySupervisorId ");
        Query query = entityManager.createQuery("FROM Supervisor supervisor LEFT JOIN FETCH supervisor.projectList WHERE supervisor.id = :id");
        query.setParameter("id", supervisorId);
        Supervisor supervisor = (Supervisor) query.getSingleResult();
        return supervisor.getProjectList();
    }
}
