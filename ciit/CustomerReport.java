package com.ciit;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerReport extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>\n"
                + "    <head>\n"
                + "        <title>Deletion Status</title>\n"
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
                + "            #table{\n"
                + "                    font-size: 25;\n"
                + "                    font-family: fantasy;\n"
                + "                    color: crimson;\n"
                + "                  }\n"
                + "        </style>\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        <center><div class=\"compName\"><img src=\"C:\\Users\\Shank's\\Desktop\\dummies.png\" alt=\"dummies\">Dummies</div></center><br>\n"
                + "        <center><font color=\"red\">Near Hotel Ashok,Laxmi Nagar, Nagpur</font></center>\n"
                + "        <hr><br><br><br>\n"
                + "        <center>\n"
                + "            <form action=\"CustomerReport\" method=\"post\">\n"
                + "                <div id=\"table\">\n"
                + "                <table>\n"
                + "                    <tr><th>Membership type :</th>   <td><select name=\"MTYPE\">\n"
                + "                                                     <option value=\"1\">Platinum</option>\n"
                + "                                                     <option value=\"2\">Gold</option>\n"
                + "                                                     <option value=\"3\">Silver</option>\n"
                + "                        </td></tr>\n"
                + "                    <tr><th>Gender :</th>   <td><input type=\"radio\" name=\"GENDER\" value=\"M\">Male<br>\n"
                + "                                                <input type=\"radio\" name=\"GENDER\"  value=\"F\">Female</td></tr>\n"
                + "                    <tr><td rowspan=\"2\"><input type=\"submit\" value=\"Submit\"></td></tr>\n"
                + "                </table>\n"
                + "                </div>      \n"
                + "            </form>\n"
                + "        </center>\n"
                + "    </body>\n"
                + "</html>\n"
                + "");
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>\n"
                + "    <head>\n"
                + "        <title>Deletion Status</title>\n"
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
                + "            table,th,td{\n"
                + "                       border-collapse: collapse;\n"
                + "                       border: 1px solid;\n"
                + "                       text-align: center;"
                + "                        }"
                + "            #table{\n"
                + "                    font-size: 25;\n"
                + "                    font-family: fantasy;\n"
                + "                    color: crimson;\n"
                + "                  }\n"
                + "        </style>\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        <center><div class=\"compName\"><img src=\"C:\\Users\\Shank's\\Desktop\\dummies.png\" alt=\"dummies\">Dummies</div></center><br>\n"
                + "        <center><font color=\"red\">Near Hotel Ashok,Laxmi Nagar, Nagpur</font></center>\n"
                + "        <hr><br><br><br>\n"
                + "        <center>\n"
                + "            <form>\n"
                + "                <div id=\"table\">\n");
        int v1 = Integer.parseInt(request.getParameter("MTYPE"));
        String v2 = request.getParameter("GENDER");

        CustomerTreeSet cts = new CustomerTreeSet();
        TreeSet<Customer> ts = cts.getCustomerDetails(v1, v2);

        if (ts.size() > 0) {
            out.println("<table width='100%'>\n"
                    + "<tr> <th>ID</th><th>Username</th><th>Address</th><th>Salary</th></tr>");
        }

        for (Customer c : ts) {

            out.println("<tr><td>" + c.id + "</td><td>" + c.username + "</td><td>" + c.address + "</td><td>" + c.salary + "</td></tr>\n");

        }
        out.println("</table>\n"
                + "                </div>      \n"
                + "            </form>\n"
                + "        </center>\n"
                + "    </body>\n"
                + "</html>\n"
                + "");

        out.close();
    }

}
