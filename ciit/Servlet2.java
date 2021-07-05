package com.ciit;

import java.io.*;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet
{
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<html>\n" +
                    "    <head>\n" +
                    "        <title>Login Details</title>\n" +
                    "        <style>\n" +
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
                    "            #login{\n" +
                    "                    font-size: 25;\n" +
                    "                    font-family: fantasy;\n" +
                    "                    color: crimson;\n" +
                    "                  }\n" +
                    "        </style>\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <center><div class=\"compName\"><img src=\"C:\\Users\\Shank's\\Desktop\\dummies.png\" alt=\"dummies\">Dummies</div></center><br>\n" +
                    "        <center><font color=\"red\">Near Hotel Ashok,Laxmi Nagar, Nagpur</font></center>\n" +
                    "        <hr>\n" +
                    "        <center><div id=\"login\">Login Details</div><br><br>\n" +
                    "        <form action='Servlet2' method='post'>\n" +
                    "            <table>\n" +
                    "                <tr>\n" +
                    "                    <td>Username:</td>  <td><input type=\"text\" name=\"USERNAME\" placeholder=\"e.g. Shri Hari\" maxlength=\"10\"></td>\n" +
                    "                </tr>\n" +
                    "                <tr>\n" +
                    "                    <td>Password:</td>  <td><input type=\"password\" name=\"PASSWORD\" placeholder=\"*********\" ></td>\n" +
                    "                </tr>\n" +
                    "                <tr>\n" +
                    "                    <td rowspan=\"2\"><center><input type=\"submit\" name=\"Submit\" value=\"Submit\"></center></td>\n" +
                    "                </tr>\n" +
                    "            </table>\n" +
                    "        </form>\n" +
                    "        </center>\n" +
                    "    </body>\n" +
                    "</html>\n" +
                    "");
        out.close();
    }
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
                          throws ServletException, IOException
    {
        String v1=request.getParameter("USERNAME");
        String v2=request.getParameter("PASSWORD");

        ProcessData obj= new ProcessData();
        int id=0;
      
           id = obj.checkUserAthority(v1, v2);
           
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        if(id>0)
        {
           /* out.println("<html>\n" +
                        "    <head>\n" +
                        "        <title>Login check</title>\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "    <center><div style=\"color: coral;font-family: fantasy;font-size: large\">Login Successful</div></center>\n" +
                        "    </body>\n" +
                        "</html>\n" +
            "");*/
            
            /*request.getSession(true);
            HttpSession session=request.getSession();
            session.setAttribute("ID",id+"");
            String s=(String)session.getAttribute("ID")*/;
            response.sendRedirect("Servlet3");
            //response.sendRedirect("Servlet3");
        }
        else
        {
            out.println("<html>\n" +
                        "    <head>\n" +
                        "        <title>Login check</title>\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "    <center><div style=\"color: red;font-family: fantasy;font-size: large\">Check Username/Password<br>Access Denied!</div></center>\n" +
                        "    </body>\n" +
                        "</html>\n" +
                        "");
        }
    out.close();
    }
}
