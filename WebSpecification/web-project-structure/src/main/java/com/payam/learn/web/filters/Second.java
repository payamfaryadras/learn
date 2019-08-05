package com.payam.learn.web.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(description = "this is second filter",urlPatterns = "/user")
public class Second implements Filter{


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Second filter has init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Second filter has called");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("Second filter has destroyed");
    }
}
