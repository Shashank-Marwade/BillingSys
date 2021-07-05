package com.ciit;
import java.sql.*;
public class DeletionProcess 
{
    public Boolean delete(String v1) throws SQLException
    {
    int id=0;
    Connection con = MyOracleConnection.getConnection();
    Statement st =con.createStatement();
     id=Integer.parseInt(v1);
    String sql="DELETE CUSTOMER_MAST WHERE ID='"+id+"'";
    System.out.println(sql);
    Boolean status=(st.execute(sql))?true:false;
    st.close();
    return status;
    }
}
