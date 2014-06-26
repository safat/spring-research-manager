package net.therap.dao.jpa;

import net.therap.dao.ProjectDao;
import net.therap.domain.Project;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
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
       Query query =  entityManager
               .createQuery("FROM Project project " +
               "LEFT JOIN FETCH project.supervisorList " +
               "LEFT JOIN FETCH project.studentList " +
               "WHERE project.id = :projectId");

        query.setParameter("projectId", projectId);
       return (Project) query.getSingleResult();

    }

    @Override
    public List<Project> getRunningProjects() {
       Query query = entityManager.createQuery("FROM Project p WHERE p.endDate < CURRENT_DATE");
       return query.getResultList();
    }

    @Override
    public void updateProject(int projectId) {
        Project project =  entityManager.find(Project.class, projectId);
        project.setTitle("new title");
//        Query query = entityManager.createQuery("UPDATE Project project SET project.title = :title WHERE project.id = :id");
//        query.setParameter("title", "bangla optical character recognition (OCR)");
//        query.setParameter("id", projectId);
//        query.executeUpdate();
    }
}
