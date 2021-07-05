package com.ciit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Del_Registration extends HttpServlet 
{

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       out.println("<html>\n" +
        "    <head>\n" +
        "        <title>Delete Forum</title>\n" +
        "    </head>\n" +
        "    <body>\n" +
        "    <center><div style=\"color: coral;font-family: fantasy;font-size: large\"><h1>Deletion forum</h1></div></center><br><br>\n" +
        "    <center><div style=\"color: darkgreen;font-style: initial;\"><h1>Enter ID to delete</h1></div>\n" +
        "    <form action=\"Del_Registration\" method=\"post\">\n" +
        "        <table>\n" +
        "           <tr>\n" +
        "               <td>ID :</td>    <td><input type=\"text\" name=\"ID\" placeholder=\"eg.23\"><br><br></td>\n" +
        "           </tr>\n" +
        "           <tr>\n" +
        "               <td rowspan=\"2\"><input type=\"Submit\" value=\"Submit\"></td>\n" +
        "           </tr>\n" +
        "        </table>\n" +
        "    </form>\n" +
        "    </center>\n" +
        "    </body>\n" +
        "</html>\n" +
        "");
       out.close();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String v1=request.getParameter("ID");
        DeletionProcess obj = new DeletionProcess();
        Boolean status;
        try {
             status=obj.delete(v1);
             //System.out.println(i);
            } catch (SQLException ex)
            {
                ex.printStackTrace();
            }
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
         if(status=true)
         {
         out.println("<html>\n" +
                        "    <head>\n" +
                        "        <title>Deletion Status</title>\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "    <center><div style=\"color: coral;font-family: fantasy;font-size: large\"><h3>ID = "+v1+"  is Successfully Deleted</h3></div><br><br>\n" +
                        "\n" +
                        "    <form action=\"Servlet3\" method=\"post\">\n" +
                        "      <input type=\"Submit\" value=\"Menu\">\n" +
                        "    </form>\n" +
                        "    </center>\n" +
                        "    </body>\n" +
                        "</html>\n" +
                        "");
         out.close();
         }
         else
         {
             out.println("<html>\n" +
                            "    <head>\n" +
                            "        <title>Deletion Status</title>\n" +
                            "    </head>\n" +
                            "    <body>\n" +
                            "    <center><div style=\"color: coral;font-family: fantasy;font-size: large\"><h3>Deletion of ID = "+v1+" is Unsuccessful</h3></div><br><br>\n" +
                            "\n" +
                            "    <form action=\"Servlet3\" method=\"post\">\n" +
                            "      <input type=\"Submit\" value=\"Submit\">\n" +
                            "    </form>\n" +
                            "    </center>\n" +
                            "    </body>\n" +
                            "</html>\n" +
                            "");
             out.close();
         }
    }

}
    

