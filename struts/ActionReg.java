package com.myapp.struts;

import javax.servlet.http.*;
import org.apache.struts.action.*;

public class ActionReg extends org.apache.struts.action.Action 
{

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response)
                                 throws Exception 
    {
        ActionRegAF af= (ActionRegAF) form;
        String u=af.getUSERNAME();
        String p=af.getPASSWORD();
        String a=af.getADDRESS();
        String g=af.getGENDER();
        String s=af.getSALARY();
        String m=af.getMTYPE();
        int id=0;
        RegisterCust reg=new RegisterCust();
        id=reg.Register(u,a,g,m,s,p);

        if(id>0)
        {
            return mapping.findForward("RegY");
        }
        else
        {
            return mapping.findForward("RegN");
        }
    } 
}
