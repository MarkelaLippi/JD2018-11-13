package by.it.nickgrudnitsky.project.java.controller;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FrontController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Action action = Action.define(req);
        Action next = null;
        try {
            next = action.cmd.execute(req, resp);
        } catch (Exception e) {
            req.setAttribute("message", e.toString());
            toJsp(req, resp, Action.ERROR.getJsp());
        }
        if (next == null || next == action) {
            toJsp(req, resp, action.getJsp());
        } else {
            resp.setHeader("Cache-Control", "no-store");
            resp.setHeader("Cache-Control", "no-cache");
            resp.sendRedirect("do?command=" + next.toString().toLowerCase());
        }
    }

    private void toJsp(HttpServletRequest req, HttpServletResponse resp, String jsp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(jsp);
        requestDispatcher.forward(req, resp);
    }

    @Override
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
