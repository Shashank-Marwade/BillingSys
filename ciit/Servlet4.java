package com.ciit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println(session);
        String id = (String) session.getAttribute("ID");
        //int s =Integer.parseInt((String)session.getAttribute("ID"));
        String c = request.getParameter("ID");
        if (id != c) {
            request.getSession().invalidate();
            response.sendRedirect("Servlet2");
        } else {
            System.out.println("done");
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>\n"
                + "    <head>\n"
                + "        <title>Registration Details</title>\n"
                + "        <style>\n"
                + "            .compName{\n"
                + "                        \n"
                + "                        font-size: 55;\n"
                + "                        font-style: oblique;\n"
                + "                        background-color: aliceblue;\n"
                + "                        color: blueviolet;\n"
                + "                     }\n"
                + "            .compName img {\n"
                + "                         float: left;\n"
                + "                         width: 150px;\n"
                + "                         height: 150px;\n"
                + "                         background: #555;\n"
                + "                         }\n"
                + "            #reg{\n"
                + "                    text-align: center;\n"
                + "                    font-size: 25;\n"
                + "                    font-family: fantasy;\n"
                + "                    color: crimson;\n"
                + "                  }\n"
                + "            #table{\n"
                + "                    text-align: center;\n"
                + "                    font-family: fantasy;\n"
                + "                    color: crimson;\n"
                + "                  }\n"
                + "        </style>\n"
                + "    </head>\n"
                + "    <body>\n"
                + "         <center><div class=\"compName\"><img src=\"C:\\Users\\Shank's\\Desktop\\dummies.png\" alt=\"dummies\">Dummies</div></center><br>\n"
                + "         <center><font color=\"red\">Near Hotel Ashok,Laxmi Nagar, Nagpur</font></center><hr>\n"
                + "         <div id=\"reg\">Registration Details</div>\n"
                + "         <center>\n"
                + "             <div id=\"table\"> \n"
                + "                 <form action='Servlet4' method='post'>\n"
                + "                    <table>\n"
                + "                        <tr><td>Name :</td>            <td><input type=\"text\" name=\"USERNAME\"></td></tr>\n"
                + "                        <tr><td>Address :</td>         <td><textarea name='ADDRESS'></textarea></td></tr>\n"
                + "                        <tr><td>Gender :</td>          <td><input type=\"radio\" name=\"GENDER\" value=\"M\">Male<br>\n"
                + "                                                           <input type=\"radio\" name=\"GENDER\" value=\"F\">Female</td></tr>\n"
                + "                        <tr><td>Membership Type:</td>  <td><select name=\"MTYPE\">\n"
                + "                                                           <option>NO Membership</option>\n"
                + "                                                           <option value=\"1\">Platinum</option>\n"
                + "                                                           <option value=\"2\">Gold</option>\n"
                + "                                                           <option value=\"3\">Silver</option>\n"
                + "                                                           </select></td></tr>\n"
                + "                        <tr><td>Salary :</td>          <td><input type=\"text\" name=\"SALARY\" min=\"0\"></td></tr>\n"
                + "                        <tr><td>Password :</td>        <td><input type=\"password\" name=\"PASSWORD\"></td></tr>\n"
                + "                        <tr><td rowspan=\"2\"><input type=\"submit\" value=\"Submit\"></td></tr>\n"
                + "                    </table>\n"
                + "                </form>\n"
                + "             </div>\n"
                + "         </center>\n"
                + "    </body>\n"
                + "</html>\n"
                + "");
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String v1 = request.getParameter("USERNAME");
        String v2 = request.getParameter("ADDRESS");
        String v3 = request.getParameter("GENDER");
        String v4 = request.getParameter("MTYPE");
        String v5 = request.getParameter("SALARY");
        String v6 = request.getParameter("PASSWORD");

        RegisterCust ref = new RegisterCust();
        int id = 0;
        try {
            id = ref.Register(v1, v2, v3, v4, v5, v6);
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (id > 0) {
            out.println("<html>\n"
                    + "    <head>\n"
                    + "        <title>Login check</title>\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "    <center><div style=\"color: coral;font-family: fantasy;size:47;\">Successfully Registered<br>Your Id is " + id + " </div></center>\n"
                    + "    </body>\n"
                    + "</html>\n"
                    + "");
        } else {
            out.println("<html>\n"
                    + "    <head>\n"
                    + "        <title>Login check</title>\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "    <center><div style=\"color: coral;font-family: fantasy;size:47;\">Unsuccessfully Registration </div></center>\n"
                    + "    </body>\n"
                    + "</html>\n"
                    + "");
        }
        out.close();
    }

}
