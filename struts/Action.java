package com.myapp.struts;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.*;
import org.apache.struts.action.*;

public class Action extends org.apache.struts.action.Action 
{

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response)throws Exception 
    {
        ActionAF af= (ActionAF)form;
        String u=af.getUSERNAME();
        String p=af.getPASSWORD();
        System.out.println(u+"        "+p);
        int id=0;
        ProcessData pd= new ProcessData();
        id=pd.checkUserAthority(u,p);
        System.out.println(id);
        
        if(id>0)
        {
            request.getSession(true).setAttribute("LID",id+"");
            System.out.println(id);
            return mapping.findForward("Y");
        }
        else
        {
            return mapping.findForward("N");
        }
    }
}
