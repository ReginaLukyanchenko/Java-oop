package com.classes.user.dao;

/**
 * Created by Regina on 06.06.2017.
 */
import com.classes.user.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public List<User> findAll();
    public boolean insert(String name , String login, String password);
    public boolean delete(String login);
    public User findByLogin(String login);
    public User findByName(String name);
    public int update(User user);
    public User select(String login, String password) throws SQLException;
    public List<User> stat();
}

