package com.ciit;

import java.sql.*;

public class UpdateProcess 
{
public Boolean update(int i,String u,String p,String a,int s) throws SQLException
{
    Connection con= MyOracleConnection.getConnection();
    Statement st= con.createStatement();
    Boolean stat;
    
    String sql="SELECT USERNAME,PASSWORD,ADDRESS,SALARY FROM CUSTOMER_MAST WHERE ID="+i+"";
    System.out.println(sql);
    ResultSet rs=st.executeQuery(sql);
    while(rs.next())
    {
        if(u!=rs.getString(1))
        {
            u=rs.getString(1);
        }
        if(p!=rs.getString(2))
        {
            p=rs.getString(2);
        }
        if(a!=rs.getString(3))
        {
            a=rs.getString(3);
        }
        if(s!=rs.getInt(4))
        {
            s=rs.getInt(4);
        }
      /*  if(g!=rs.getString(5))
        {                               ",GENDER='"+g+
           g=rs.getString(5);
        }*/
    }
    sql="UPDATE CUSTOMER_MAST SET USERNAME='"+u+"',PASSWORD='"+p+",ADDRESS='"+a+"'"
            + ",SALARY="+s+" WHERE ID="+i+"";
    System.out.println(sql);
    stat=st.execute(sql)?true:false;
    return stat;
}
}
