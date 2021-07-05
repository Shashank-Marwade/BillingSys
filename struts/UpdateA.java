package com.myapp.struts;

import java.sql.*;
import javax.servlet.http.*;
import org.apache.struts.action.*;

public class UpdateA extends org.apache.struts.action.Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        Connection con = MyOracleConnection1.getConnection();
        Statement st = con.createStatement();
        UpdateAF a = (UpdateAF) form;
        int i = a.getID();
        int s, m;
        String u, p, ad, g;
        String sql = "SELECT * FROM CUSTOMER_MAST WHERE ID='" + i + "'";
        System.out.println("sql");
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            ad = rs.getString(2);
            m = rs.getInt(3);
            g = rs.getString(4);
            s = rs.getInt(5);
            u = rs.getString(6);
            p = rs.getString(7);

        request.getSession(true).setAttribute("i", i+"");
        request.getSession(true).setAttribute("u", u);
        request.getSession(true).setAttribute("p", p);
        request.getSession(true).setAttribute("a", ad);
        request.getSession(true).setAttribute("s", s+"");
        request.getSession(true).setAttribute("g", g);
        request.getSession(true).setAttribute("m", m+"");
            //boolean stat;
            //UpdateProcess reg=new UpdateProcess();
            //stat=reg.update(i ,u, p, ad, s);
            System.out.println("It is an update AF " + i + " " + u + " " + p + " " + ad + " " + s);
            if (i > 0) {
                return mapping.findForward("Y");
            } else {
                return mapping.findForward("N");
            }

        }
        return null;
        }

    }
