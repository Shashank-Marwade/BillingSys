package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class DeleteAF extends org.apache.struts.action.ActionForm {

    private String GENDER;
    private int MTYPE;

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public int getMTYPE() {
        return MTYPE;
    }

    public void setMTYPE(int MTYPE) {
        this.MTYPE = MTYPE;
    }

}
