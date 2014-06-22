package net.therap.service;

import net.therap.dao.UserDao;
import net.therap.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/22/14
 * Time: 4:06 PM
 * To change this template use File | Settings | File Templates.
 */

@Service
@Transactional
public class UserService {
    @Autowired
    @Qualifier ("userDaoJpa")
    UserDao userDao;

    public List<User> getUserList(){
       return userDao.getUserList();
    }
}
