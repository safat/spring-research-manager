package net.therap.dao;

import net.therap.domain.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shakhawat.hossain
 * Date: 6/22/14
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao {
    public List<User> getUserList();
}
