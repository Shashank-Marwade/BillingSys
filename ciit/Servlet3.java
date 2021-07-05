package com.ciit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet3 extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException
    {
        HttpSession session=request.getSession();
        System.out.println(session);
       String id=(String)session.getAttribute("ID");
        //int s =Integer.parseInt((String)session.getAttribute("ID"));
        String c =request.getParameter("ID");
        if(id!=c)
        {
            request.getSession().invalidate();
            response.sendRedirect("Servlet2");
        }
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<html>\n" +
"    <head>\n" +
"        <title>Menu</title>\n" +
"         <style>\n" +
"            .compName{\n" +
"                        \n" +
"                        font-size: 55;\n" +
"                        font-style: oblique;\n" +
"                        background-color: aliceblue;\n" +
"                        color: blueviolet;\n" +
"                     }\n" +
"            .compName img {\n" +
"                         float: left;\n" +
"                         width: 150px;\n" +
"                         height: 150px;\n" +
"                         background: #555;\n" +
"                         }\n" +
"            #menu{\n" +
"                    text-align: center;\n" +
"                    font-size: 25;\n" +
"                    font-family: fantasy;\n" +
"                    color: crimson;\n" +
"                  }\n" +
"            #content{\n" +
"                    text-align: center;\n" +
"                    font-size: 25;\n" +
"                    font-family: fantasy;\n" +
"                    color: crimson;\n" +
"                    }\n" +
"        </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        \n" +
"        <center><div class=\"compName\"><img src=\"C:\\Users\\Shank's\\Desktop\\dummies.png\" alt=\"dummies\">Dummies</div></center><br>\n" +
"        <center><font color=\"red\">Near Hotel Ashok,Laxmi Nagar, Nagpur</font></center><hr>\n" +
"        <div id=\"menu\">Menu</div>\n" +
"        <div id=\"content\"><a href=\"Servlet4\">Create Registration</a><br><br>\n" +
"                          <a href=\"Update\">UpdateRegistration</a><br><br>\n" +
"                          <a href=\"Del_Registration\">Delete Registration</a><br><br>\n" +
"                          <a href=\"CustomerReport\">Registration Report</a><br><br>\n" +
"                          <a href=\"Servlet2\">Log Off</a></div>\n" +
"    </body>\n" +
"</html>\n" +
"");
out.close();
}
/*
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                          throws ServletException, IOException 
    {

    }
*/    
}
