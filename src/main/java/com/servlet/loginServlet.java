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


public class loginServlet extends HttpServlet {
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

        try{
            HttpSession session = request.getSession(true);
            Object login1 = session.getAttribute("login");
            if (login1!=null) {
                getServletContext().getRequestDispatcher("/main.jsp").forward(request,response);
                return;
            }
            String login = request.getParameter("login");
            String password = request.getParameter("password");
            UserDao dao = new UserDaoImpl();
              User select = dao.select(login, password);
        if (select!=null) {
            request.getSession().setAttribute("login", login);
            getServletConfig().getServletContext()
                    .getRequestDispatcher("/menu.jsp")
                    .forward(request, response);
                    }

    } catch (Exception e) {
        e.printStackTrace();
    }

    }
}
