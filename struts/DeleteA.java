package com.myapp.struts;

import java.util.TreeSet;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class DeleteA extends Action 
{

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                HttpServletRequest request, 
                                HttpServletResponse response)throws Exception 
    {
        DeleteAF af=(DeleteAF) form;
        int m=af.getMTYPE();
        String g=af.getGENDER();
        
        CustomerTreeSet ct=new CustomerTreeSet();
        TreeSet ts = ct.getCustomerDetails(m,g);
        request.getSession(true).setAttribute("T",ts);
        System.out.println("size of ts : "+ts.size());
        return mapping.findForward("Y");
    }
}
