package com.myapp.struts;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.*;
import org.apache.struts.action.*;

public class DeleteStA extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        
            DeleteStAF r=(DeleteStAF) form;
            String i[]=r.getID();
            Del_Process d=new Del_Process();
            d.del(i);
            return mapping.findForward("Y");
    }
}
