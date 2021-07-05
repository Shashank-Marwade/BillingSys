package com.ciit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet5 extends HttpServlet 
{

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      out.println("<html>\n" +
"    <head>\n" +
"        <title>Report</title>\n" +
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
"            #report{\n" +
"                    text-align: center;\n" +
"                    font-size: 25;\n" +
"                    font-family: fantasy;\n" +
"                    color: crimson;\n" +
"                  }\n" +
"                  #table td{\n" +
"                            text-align: center;\n" +
"                            font-family: fantasy;\n" +
"                            color: crimson;\n" +
"                        }\n" +
"                .table\n" +
"                {\n" +
"                    border: 1px black; \n" +
"                    border-collapse: collapse;\n" +
"                }\n" +
"                \n" +
"        </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <center><div class=\"compName\"><img src=\"C:\\Users\\Shank's\\Desktop\\dummies.png\" alt=\"dummies\">Dummies</div></center><br>\n" +
"         <center><font color=\"red\">Near Hotel Ashok,Laxmi Nagar, Nagpur</font></center><hr>\n" +
"         <div id=\"report\">Report</div>\n" +
"         <div id=\"table\"><center>\n" +
"        <table class=\"table\" style=\"width:100%\">\n" +
"            <tr>\n" +
"                <th>Id</th>\n" +
"                <th>Username</th>\n" +
"                <th>Address</th>\n" +
"                <th>Memebership type</th>\n" +
"                <th>Salary</th>\n" +
"                <th>Gender</th>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td>1</td>\n" +
"                <td>Shashank</td>\n" +
"                <td>Bajaj Nagar</td>\n" +
"                <td>Platinum</td>\n" +
"                <td>120000</td>\n" +
"                <td>M</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td>2</td>\n" +
"                <td>Sunidhi</td>\n" +
"                <td>Laxmi Nagar</td>\n" +
"                <td>Gold</td>\n" +
"                <td>25000</td>\n" +
"                <td>F</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td>3</td>\n" +
"                <td>Shri Hari</td>\n" +
"                <td>Shankar Nagar</td>\n" +
"                <td>Platinum</td>\n" +
"                <td>60000</td>\n" +
"                <td>M</td>\n" +
"            </tr>\n" +
"        </table></center>\n" +
"        </div>\n" +
"    </body>\n" +
"</html>\n" +
"");
      out.close();
    }

    /*protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
    }*/
}
