package JSP;
import java.sql.*;

public class Del_Process 
{
  public void del(String[] i) throws SQLException
  {
      
      Connection con= JSP.MyOracleConnection1.getConnection();
      Statement st= con.createStatement();
      for(String c:i)
      {
       String sql = "DELETE CUSTOMER_MAST WHERE ID='"+ c + "'";
       System.out.println(sql);
       st.execute(sql);
       /*while(rs.next())
       {
           System.out.println("successfull deleted");        
       }*/
     }
      st.close();
  }
}
