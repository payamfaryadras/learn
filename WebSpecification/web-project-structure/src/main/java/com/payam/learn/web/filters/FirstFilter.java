package com.payam.learn.web.filters;


import com.payam.learn.web.websockets.HelloWorldEndpoint;

import javax.servlet.*;
import javax.websocket.server.ServerEndpointConfig;
import java.io.IOException;

public class FirstFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.printf("Filter init()");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter has called");
        ServerEndpointConfig.Builder.create(HelloWorldEndpoint.class, "/hello").build();
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("filter has destroyed");
    }
}
