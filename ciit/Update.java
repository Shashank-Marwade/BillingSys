package com.ciit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Update extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>\n" +
"    <head>\n" +
"        <title>Update</title>\n" +
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
"            #update{\n" +
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
"        <div id=\"update\">Update</div>\n" +
"        <center>\n" +
"        <form action=\"Update\" method=\"post\">\n" +
"            <table>\n" +
"                <tr><th>Enter ID :<th>  <td><input type=\"number\" name=\"ID\" ><br><br></td></tr>\n" +
"                <tr><th colspan=\"2\">Which details to update ? :<th> </tr>\n" +
"                <tr><td><input type=\"checkbox\" name=\"To_UPDATE\" value=\"USERENAME\">Username</td>\n" +
"                    <td><input type=\"checkbox\" name=\"To_UPDATE\" value=\"PASSWORD\">Password</td></tr>\n" +
"                <tr><td><input type=\"checkbox\" name=\"To_UPDATE\" value=\"ADDRESS\">Address</td>\n" +
"                    <td><input type=\"checkbox\" name=\"To_UPDATE\" value=\"GENDER\">Gender</td></tr>\n" +
"                <tr></tr><td colspan=\"2\"><input type=\"checkbox\" name=\"To_UPDATE\" value=\"SALARY\">Salary</td></tr>\n" +
"                <tr><td colspan=\"2\"><input type=\"submit\" value=\"Submit\"></td></tr>\n" +
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
        Boolean s;
        int v1 = Integer.parseInt(request.getParameter("ID"));
        String v2=request.getParameter("USERNAME");
        String v3=request.getParameter("PASSWORD");
        String v4=request.getParameter("ADDRESS");
        //String v6=request.getParameter("ADDRESS");
        int v5=Integer.parseInt(request.getParameter("SALARY"));
        
        UpdateProcess up=new UpdateProcess();
        try {
             s=up.update(v1, v2, v3, v4, v5);
        } catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
        response.setContentType("text/html");
            PrintWriter out = response.getWriter();
        if(s=true)
        {
            
            out.println("<html>\n" +
"   <head>\n" +
"    <title>update Status</title>\n" +
"   </head>\n" +
"   <body>\n" +
"   <center>\n" +
"       <div style=\"font-family: cursive;color: chartreuse\"><h1>Update Successful</h1></div><br><br>\n" +
""                    + "<form action=\"Servlet\">"
                    + "<input type=\"submit\" value=\"Menu\">\n" +
"                     </form>"
                    + "  </center>    \n" +
"   </body>\n" +
"</html>");
        }else
        {
            out.println("<html>\n" +
"   <head>\n" +
"    <title>update Status</title>\n" +
"   </head>\n" +
"   <body>\n" +
"   <center>\n" +
"       <div style=\"font-family: cursive;color: chartreuse\"><h1>Update Unsuccessful</h1></div><br><br>\n" +
"       <form action=\"Menu\">\n" +
"       <input type=\"submit\" value=\"Menu\" >\n" +
"       </form>\n" +
"    </center>    \n" +
"   </body>\n" +
"</html>");
        }
        
    }

}
