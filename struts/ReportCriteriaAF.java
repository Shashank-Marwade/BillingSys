package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;
import org.apache.struts.upload.MultipartRequestHandler;

public class ReportCriteriaAF extends ActionForm 
{
    int MTYPE;
    String GENDER;

    public int getMTYPE() {
        return MTYPE;
    }

    public void setMTYPE(int MTYPE) {
        this.MTYPE = MTYPE;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }


}
