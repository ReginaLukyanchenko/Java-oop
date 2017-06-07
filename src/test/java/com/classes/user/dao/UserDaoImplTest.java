package com.classes.user.dao;

import com.classes.user.User;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Regina on 07.06.2017.
 */
public class UserDaoImplTest {
    private static    UserDao dao = new UserDaoImpl();

    @Test
    public void delete() throws Exception {
        insertForTest();
        boolean test = dao.delete("testt");
        Assert.assertTrue(test);
    }

    private void insertForTest() {
        boolean insert = dao.insert("testt", "testt", "test");

    }

    @Test
    public void findByLogin() throws Exception {
        User wqewq = dao.findByLogin("wqewq");
        Assert.assertNotNull(wqewq);
    }

    @Test
    public void findByLoginNull() throws Exception {
        User user = dao.findByLogin("123123");
        Assert.assertNull(user);
    }
    @Test
    public void findByName() throws Exception {
        User qwwqedwq = dao.findByName("qwwqedwq");
        Assert.assertNotNull(qwwqedwq);
    }

    @Test
    public void insert() throws Exception {
        boolean insert = dao.insert("testt", "testt", "test");
        Assert.assertTrue(insert);
        boolean delete = dao.delete("testt");
        Assert.assertTrue(delete);
    }


}