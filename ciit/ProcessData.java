package com.ciit;
import java.sql.*;

public class ProcessData
{
   
    public int checkUserAthority(String v1,String v2) 
    {
            
            int id=0;
            try{
                
            Connection con = MyOracleConnection.getConnection();
            Statement st=con.createStatement();
            //System.out.println(v1+"  "+v2);
            String sql="SELECT ID FROM CUSTOMER_MAST WHERE PASSWORD='"+v2+"' AND USERNAME='"+v1+"'";
            System.out.println(sql);
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
                id=rs.getInt(1);
            }
            st.close();
        con.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return id;
    }
   
}