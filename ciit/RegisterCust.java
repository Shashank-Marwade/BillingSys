package com.ciit;
import java.sql.*;

public class RegisterCust 
{
    
    public int Register(String v1,String v2,String v3,String v4,String v5,String v6) throws SQLException
    {
        int id=0;
        int v_5=Integer.parseInt(v5);
        int v_4=Integer.parseInt(v4);
        
        Connection con=MyOracleConnection.getConnection();
        Statement st=con.createStatement();
        String sql="SELECT MAX(ID)+1 FROM CUSTOMER_MAST";
        System.out.println(sql);
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
            id=rs.getInt(1);
        }
        sql="INSERT INTO CUSTOMER_MAST(ID,ADDRESS,MTYPE,SALARY,USERNAME,PASSWORD,GENDER) VALUES("+id+",'"+v2+"',"+v_4+","+v_5+",'"+v1+"','"+v6+"','"+v3+"')";
        
        
        System.out.println(sql);
        st.executeQuery(sql);
        return id;
    }
    
}
