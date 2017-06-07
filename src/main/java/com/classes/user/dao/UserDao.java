package main.java.com.classes.user.dao;

/**
 * Created by Regina on 06.06.2017.
 */
import main.java.com.classes.user.Profile;
import main.java.com.classes.user.Player;
import main.java.com.exception.UserNotExistException;

public class ProfileDao {
    boolean authenticate(String login, String password) throws UserNotExistException;
    User getUser(String name) throws UserNotExistException;

}

