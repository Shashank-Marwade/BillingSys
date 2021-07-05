package com.myapp.struts;

import javax.servlet.http.*;
import org.apache.struts.action.*;

public class UpdateItA extends org.apache.struts.action.Action 
{

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                HttpServletRequest request, HttpServletResponse response)throws Exception 
    {
        UpdateItAF a=(UpdateItAF) form;
        String u=a.getUSERNAME();
        String p=a.getPASSWORD();
        String ad=a.getADDRESS();
        String g=a.getGENDER();
        int s=a.getSALARY();
        int m=a.getMTYPE();
        int i=a.getID();
        int stat=0;
        UpdateProcess reg=new UpdateProcess();
        stat=reg.update(i ,u, p, ad, s);
        System.out.println("This is UpdateItA "+i+" "+u+" "+p+" "+ad+" "+s);
        if(stat==1)
        {
            return mapping.findForward("Y");
        }
        else
        {
            return mapping.findForward("N");
        }
        
    }
}
