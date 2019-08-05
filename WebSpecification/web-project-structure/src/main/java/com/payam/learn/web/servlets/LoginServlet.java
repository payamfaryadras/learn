package com.payam.learn.web.servlets;

import org.graalvm.compiler.debug.Assertions;
import sun.rmi.server.Dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet(urlPatterns = "/loginServlet" ,name = "loginServlet")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        Objects.requireNonNull(password);
        Objects.requireNonNull(userName);

        if (userName.compareTo("payam") == 0 && password.compareTo("payam") == 0) {
            HttpSession session = req.getSession();
            session.setAttribute("userId", "payam");
            HttpServletResponse response = (HttpServletResponse) resp;
            response.sendRedirect("index.jsp");
        } else {
            PrintWriter writer = resp.getWriter();
            writer.println("<font color=red>Either user name or password is wrong.</font>");
            HttpServletRequest request = (HttpServletRequest) req;
            writer.flush();
            RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
            dispatcher.include(request, resp);
        }


    }


}
