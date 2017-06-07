package main.java.com.classes.user.dao;

import java.sql.*;
import main.java.com.classes.user.User;
import main.java.com.exception.UserNotExistException;
import main.java.com.DBHelper;
import java.util.*;
import java.sql.Statement;

/**
 * Created by Regina on 06.06.2017.
 */
public abstract class UserDaoImp implements UserDao {

    DBHelper DB = new DBHelper();
    private static final String DELETE = "DELETE FROM user WHERE login=?";
    private static final String FIND_ALL = "SELECT * FROM user ORDER BY id";
    private static final String FIND_BY_LOGIN = "SELECT * FROM user WHERE login=?";
    private static final String FIND_BY_NAME = "SELECT * FROM user WHERE name=?";
    private static final String INSERT = "INSERT INTO user(name, login, password, score, currentRoomNumber) VALUES(?, ?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE user SET score=?, currentRoomNumber=? WHERE id=?";

    public int delete(String login) {


        try {
            DB.open();
            DB.stmt = DB.conn.prepareStatement(DELETE);
            DB.stmt.setString(1, login);

            return DB.stmt.executeUpdate();
        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            DB.close();
        }

    }
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
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            DB.close();
        }
    }
    public int insert(User user) {


        try {
            DB.open();
            DB.stmt = DB.conn.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            DB.stmt.setString(1, user.getName());
            DB.stmt.setString(2, user.getLogin());
            DB.stmt.setString(3, user.getPassword());
            DB.stmt.setInt(4, user.player.getScore());
            DB.stmt.setInt(5, user.player.getCurrentRoomNumber());

            int result = DB.stmt.executeUpdate();
            ResultSet rs = DB.stmt.getGeneratedKeys();

            if (rs.next()) {
                user.setId(rs.getInt(1));
            }

            return result;
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

}
