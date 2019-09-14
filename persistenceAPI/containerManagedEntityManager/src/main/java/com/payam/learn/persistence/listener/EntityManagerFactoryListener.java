package com.payam.learn.persistence.listener;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.EntityManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.logging.Logger;

@WebListener
public class EntityManagerFactoryListener implements ServletContextListener {
    public final Logger logger = Logger.getLogger(String.valueOf(EntityManagerFactoryListener.class));
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        SessionFactory sessionFactoryObj = (SessionFactory) servletContextEvent.getServletContext().getAttribute("SessionFactory");
        if(sessionFactoryObj != null && !sessionFactoryObj.isClosed()) {
            logger.info("Closing Session Factory Object!");
            sessionFactoryObj.close();
        }
        logger.info("Hibernate Session Factory Object Released!");
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {



        // Create registry
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        // Create MetadataSources
        MetadataSources sources = new MetadataSources(registry);
        // Create Metadata
        Metadata metadata = sources.getMetadataBuilder().build();
        // Create SessionFactory
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        servletContextEvent.getServletContext().setAttribute("SessionFactory", sessionFactory);
        logger.info("Hibernate Session Factory Configured Successfully!");
    }
}
