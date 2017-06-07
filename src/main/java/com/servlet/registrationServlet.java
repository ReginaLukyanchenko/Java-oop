package com.servlet;

/**
 * Created by Regina on 05.06.2017.
 */
import com.classes.user.User;
import com.classes.user.dao.UserDao;
import com.classes.user.dao.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.sql.*;



public class registrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }
    private void process(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        HttpSession session = request.getSession(true);
        Object login1 = session.getAttribute("login");
        if (login1!=null)   getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
        try{
            String login = request.getParameter("login");
            String password = request.getParameter("password");
            String name = request.getParameter("name");

            UserDao dao = new UserDaoImpl();
            boolean insert = dao.insert(name, login, password);
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            if (insert) {

                session.setAttribute("login", login);
                out.write("success");
                getServletContext().getRequestDispatcher("/menu.jsp").forward(request,response);
            } else {
                out.write("failed");
                getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
