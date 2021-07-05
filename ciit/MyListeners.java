package com.ciit;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListeners implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener, ServletRequestListener, ServletRequestAttributeListener {

    public void contextInitialized(ServletContextEvent sce) 
    {
        System.out.println("contextInitialized");
    }

    public void contextDestroyed(ServletContextEvent sce)
    {
                System.out.println("contextDestroyed");

    }

    public void attributeAdded(ServletContextAttributeEvent event) 
    {     System.out.println("attributeAdded");   }

    
    public void attributeRemoved(ServletContextAttributeEvent event)
    {
        System.out.println("attributeRemoved");

    }
    public void attributeReplaced(ServletContextAttributeEvent arg0) 
    {
        System.out.println("attributeReplaced");

    }

    public void sessionCreated(HttpSessionEvent se) 
    {
        System.out.println("sessionCreated");

    }

    public void sessionDestroyed(HttpSessionEvent se) 
    {
        System.out.println("sessionDestroyed");

    }

    public void attributeAdded(HttpSessionBindingEvent event) 
    {
        System.out.println("attributeAdded");

    }

    public void attributeRemoved(HttpSessionBindingEvent event) 
    {
        System.out.println("attributeRemoved");

    }

    public void attributeReplaced(HttpSessionBindingEvent event) 
    {
        System.out.println("attributeReplaced");
    
    }

    public void requestDestroyed(ServletRequestEvent sre) 
    {
        System.out.println("requestDestroyed");

    }

    public void requestInitialized(ServletRequestEvent sre) 
    {
                System.out.println("requestInitialized");

    }

    public void attributeAdded(ServletRequestAttributeEvent srae) 
    {
                System.out.println("attributeAdded");

    }

    public void attributeRemoved(ServletRequestAttributeEvent srae) 
    {
                System.out.println("attributeRemoved");

    }

    public void attributeReplaced(ServletRequestAttributeEvent srae) 
    {
        System.out.println("attributeReplaced");
    }
}
