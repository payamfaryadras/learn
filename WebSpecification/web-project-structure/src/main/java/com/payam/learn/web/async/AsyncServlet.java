package com.payam.learn.web.async;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "asyncServlet",urlPatterns = "/asyncServlet" , asyncSupported = true)
public class AsyncServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final AsyncContext context = req.startAsync();
        context.start(()->{
            HttpServletResponse response = (HttpServletResponse) context.getResponse();
            try {
                response.getOutputStream().println("****************** run in Async mode *********************");
            } catch (IOException e) {
                e.printStackTrace();
            }
            context.complete();
        });

    }
}
