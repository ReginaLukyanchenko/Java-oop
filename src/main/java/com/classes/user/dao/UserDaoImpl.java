package com.classes.user.dao;

import com.DBHelper;
import com.classes.user.User;

import java.sql.*;

import java.util.*;

/**
 * Created by Regina on 06.06.2017.
 */
public  class UserDaoImpl implements UserDao {

    private static final String STATS = "SELECT  * FROM user ORDER BY score DESC LIMIT 10";
    private DBHelper DB = new DBHelper();
    private static final String DELETE = "DELETE FROM user WHERE login=?";
    private static final String FIND_ALL = "SELECT * FROM user ORDER BY id";
    private static final String FIND_BY_LOGIN = "SELECT * FROM user WHERE login=?";
    private static final String FIND_BY_NAME = "SELECT * FROM user WHERE name=?";
    private static final String INSERT = "INSERT INTO user(name, login, password) VALUES(?, ?, ?)";
    private static final String UPDATE = "UPDATE user SET score=?, currentRoomNumber=? WHERE id=?";
    private static final String SELECT = "SELECT  * FROM  user WHERE login = ? AND  password = ?";

    public List<User> findAll() {

        List<User> list = new ArrayList<User>();

        try { DB.open();
            DB.stmt = DB.conn.prepareStatement(FIND_ALL);
            ResultSet rs = DB.stmt.executeQuery();

            while (rs.next()) {
                User user = new User(rs.getInt("id"),rs.getString("name"), rs.getString("login"),rs.getString("password") );
                list.add(user);
            }
        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            DB.close();
        }

        return list;
    }
    public boolean delete(String login) {


        try {
            DB.open();
            DB.stmt = DB.conn.prepareStatement(DELETE);
            DB.stmt.setString(1, login);
            int i = DB.stmt.executeUpdate();
            if (i>0) return true; else  return  false;
        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            DB.close();
        }

    }

    public User findByLogin(String login) {

        try {
            DB.open();
            DB.stmt = DB.conn.prepareStatement(FIND_BY_LOGIN);
            DB.stmt.setString(1, login);
            ResultSet rs = DB.stmt.executeQuery();

            if (rs.next()) {
                User user = new User(rs.getInt("id"),rs.getString("name"), rs.getString("login"),rs.getString("password") );

                return user;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DB.close();
        }
    }
    public User findByName(String name) {

        try {
           DB.open();
            DB.stmt = DB.conn.prepareStatement(FIND_BY_NAME);
            DB.stmt.setString(1, name);
            ResultSet rs = DB.stmt.executeQuery();

            if (rs.next()) {
                User user = new User(rs.getInt("id"),rs.getString("name"), rs.getString("login"),rs.getString("password") );

                return user;
            } else {
                return null;
            }
        } catch (SQLException e) {

            throw new RuntimeException(e);
        } finally {
            DB.close();
        }
    }
    public boolean insert(String name, String login, String password) {


        try {
            User byLogin = findByLogin(name);
            if (byLogin!=null) return  false;

            DB.open();
            DB.stmt = DB.conn.prepareStatement(INSERT);
            DB.stmt.setString(1, name);
            DB.stmt.setString(2, login);
            DB.stmt.setString(3, password);
            int result = DB.stmt.executeUpdate();

            if (result!=0) return  true; else return false;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DB.close();
        }
    }
    public int update(User user) {

        try {
            DB.open();
            DB.stmt = DB.conn.prepareStatement(UPDATE);
            DB.stmt.setString(1, user.getName());
            DB.stmt.setString(2, user.getLogin());
            DB.stmt.setString(3, user.getPassword());
            DB.stmt.setInt(4, user.player.getScore());
            DB.stmt.setInt(5, user.player.getCurrentRoomNumber());
            return DB.stmt.executeUpdate();
        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
           DB.close();
        }
    }
    public   User select( String login, String password) throws SQLException
    {
        try {
            DB.open();
            DB.stmt = DB.conn.prepareStatement(SELECT);
            DB.stmt.setString(1, login);
            DB.stmt.setString(2, password);
            ResultSet rs = DB.stmt.executeQuery();
            if (rs.next()) {
                 return   new User(rs.getInt("id"),rs.getString("name"), rs.getString("login"),rs.getString("password") );

            } else return  null;
        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            DB.close();
        }
    }

    public List<User> stat() {

        List<User> list = new ArrayList<User>();

        try {
            DB.open();
            DB.stmt = DB.conn.prepareStatement(STATS);
            ResultSet rs = DB.stmt.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt("id"),rs.getString("name"), rs.getString("login"),rs.getString("password") , rs.getInt("score") );
                list.add(user);
            }

        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            DB.close();
        }
        return list;
    }
}


