package com.ciit;
import java.util.*;
import java.sql.*;

public class CustomerTreeSet 
{ 
    public TreeSet<Customer> getCustomerDetails(int M,String G) 
    {
    TreeSet<Customer> ts = new TreeSet<Customer>(new sortingLogic());
try{     
     //int m=Integer.getInteger(M);
    
     Connection con=MyOracleConnection.getConnection();
     Statement st = con.createStatement();
     String sql="SELECT ID,USERNAME,ADDRESS,SALARY FROM CUSTOMER_MAST WHERE MTYPE='"+M+"' AND GENDER='"+G+"'";
     System.out.println(sql);
     ResultSet rs=st.executeQuery(sql);
     while(rs.next())
     {
        ts.add(new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
     }
     st.close();
}catch(Exception ex)
{
    ex.printStackTrace();
}
     return ts;
    }
    
}
class sortingLogic implements java.util.Comparator<Customer>
    {
        public int compare(Customer o1,Customer o2)
        {
            return(o1.id-o2.id);
        }
    }
