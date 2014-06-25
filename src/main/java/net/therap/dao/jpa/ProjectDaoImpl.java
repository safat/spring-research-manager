package net.therap.dao.jpa;

import net.therap.dao.ProjectDao;
import net.therap.domain.Project;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/24/14
 * Time: 12:10 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Qualifier("projectDaoJpa")
public class ProjectDaoImpl implements ProjectDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Project getProjectById(int projectId) {
       return entityManager.find(Project.class, projectId);
    }

    @Override
    public List<Project> getRunningProjects() {
       Query query = entityManager.createQuery("FROM Project p WHERE p.endDate < CURRENT_DATE");
       return query.getResultList();
    }
}
