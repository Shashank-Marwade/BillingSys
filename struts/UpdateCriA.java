package com.myapp.struts;

import java.util.TreeSet;
import javax.servlet.http.*;
import org.apache.struts.action.*;

public class UpdateCriA extends org.apache.struts.action.Action 
{
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response)throws Exception 
    {
        UpdateCriAF a=(UpdateCriAF) form;
        //UpdateCriAF a=(UpdateCriAF) form;
        int m=a.getMTYPE();
        String g=a.getGENDER();
        
        CustomerTreeSet ct=new CustomerTreeSet();
        TreeSet ts = ct.getCustomerDetails(m,g);
        request.getSession(true).setAttribute("T",ts);
        System.out.println("size of ts : "+ts.size());
        return mapping.findForward("Y");
    }
}
