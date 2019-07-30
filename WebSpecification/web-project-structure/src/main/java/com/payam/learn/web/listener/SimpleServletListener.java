package com.payam.learn.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SimpleServletListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ContextListener is starting");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ContextListener is destroyed");

    }
}