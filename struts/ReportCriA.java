package com.myapp.struts;

import java.util.TreeSet;
import javax.servlet.http.*;
import org.apache.struts.action.*;

public class ReportCriA extends Action 
{

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response)throws Exception 
    {
        ReportCriteriaAF af=(ReportCriteriaAF) form;
        int m=af.getMTYPE();
        String g=af.getGENDER();
        CustomerTreeSet ct=new CustomerTreeSet();
        TreeSet ts = ct.getCustomerDetails(m,g);
        request.getSession(true).setAttribute("T",ts);
        System.out.println("size of ts : "+ts.size());
        return mapping.findForward("Y");
    }
}
