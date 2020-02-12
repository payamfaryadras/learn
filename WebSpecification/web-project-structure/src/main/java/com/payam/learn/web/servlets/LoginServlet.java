package com.payam.learn.web.servlets;

import com.payam.learn.web.model.LoginModel;
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
import javax.validation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

@WebServlet(urlPatterns = "/loginServlet", name = "loginServlet")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        Locale.setDefault(Locale.US);

        LoginModel model = new LoginModel();
        model.setPassword(request.getParameter("password"));
        model.setUserName(request.getParameter("userName"));

        Locale.setDefault(Locale.US);
        Configuration<?> config = Validation.byDefaultProvider().configure();
        ValidatorFactory factory = config.buildValidatorFactory();
        Validator validator = factory.getValidator();
        factory.close();
        Set<ConstraintViolation<LoginModel>> constraintViolations = validator.validate(model);

        if (!constraintViolations.isEmpty()) {
            String errors = "<ul>";
            for (ConstraintViolation<LoginModel> constraintViolation : constraintViolations) {
                errors += "<li>" + constraintViolation.getPropertyPath() + " " + constraintViolation.getMessage()
                        + "</li>";
            }
            errors += "</ul>";
            request.setAttribute("model", model);
            request.setAttribute("errors", errors);
            request.getRequestDispatcher("/login.jsp").forward(request, resp);
        } else {

            request.getRequestDispatcher("/index.jsp").forward(request, resp);
        }



/*
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
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
        }*/


    }


}
