package com.ciit;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.util.Date;

public class Servlet1 extends HttpServlet
{
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws IOException,ServletException
    {
        response.setContentType("text/html");
        Date today=new Date();
        PrintWriter out=response.getWriter();
        out.println("<html><body><center><h1>servletDemo : "+today+"</h1></center></body></html>");
        out.close();
    }
    
}
