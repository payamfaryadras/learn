package com.payam.learn.web.sample1.servlet;

import com.google.gson.Gson;
import com.payam.learn.web.sample1.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "userServlet", urlPatterns = "/userServlet")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setcDate(new Date());
        user.setfName("Payam");
        user.setlName("Faryadras");
        user.setCreateBy("Payam");
        user.setId(new Long(10));
        Gson gson = new Gson();
        String userDetail = gson.toJson(user);
        PrintWriter printWriter = resp.getWriter();
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        printWriter.write(userDetail);
        printWriter.flush();
    }
}
