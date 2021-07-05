package com.ciit;
import java.sql.*;
import java.io.*;
public class MyOracleConnection 
{
    public static Connection getConnection()
    {
        Connection con= null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
            con= DriverManager.getConnection(url, "shashank", "s");
            }catch(Exception e)
            {
                e.printStackTrace();
            }
            return con;
            }
}
