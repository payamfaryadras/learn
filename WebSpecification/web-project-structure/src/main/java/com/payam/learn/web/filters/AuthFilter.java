package com.payam.learn.web.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.http.HttpRequest;

@WebFilter(urlPatterns = "/payam")
public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
      HttpServletRequest request = (HttpServletRequest) servletRequest;
       /*  HttpSession session = request.getSession(false);
        boolean isLoggedIn = (session != null) && (session.getAttribute("userId") != null);
        String loginURI = request.getContextPath() + "/loginServlet";

        boolean isLoginRequest = request.getRequestURI().equals(loginURI);
        if (isLoggedIn) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request,servletResponse);
            filterChain.doFilter(servletRequest, servletResponse);
        } else if(isLoginRequest) {
            filterChain.doFilter(request, servletResponse);

        }else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request,servletResponse);
        }*/
       filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       // System.out.printf("Filter init()");
    }
    @Override
    public void destroy() {
        //System.out.println("filter has destroyed");
    }


}
