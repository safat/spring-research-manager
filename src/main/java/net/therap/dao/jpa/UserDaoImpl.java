package net.therap.dao.jpa;

import net.therap.dao.UserDao;
import net.therap.domain.Supervisor;
import net.therap.domain.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/22/14
 * Time: 3:59 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
@Qualifier("userDaoJpa")
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getUserList(){
        return entityManager.createQuery("FROM Supervisor").getResultList();
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(Supervisor.class, id);
    }
}
