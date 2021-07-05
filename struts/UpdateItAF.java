package com.myapp.struts;

import javax.servlet.http.*;
import org.apache.struts.action.*;

public class UpdateItAF extends org.apache.struts.action.ActionForm 
{
    
    private String USERNAME,PASSWORD,ADDRESS;
    private String GENDER;
    private int SALARY,MTYPE;
    private int ID;

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public int getSALARY() {
        return SALARY;
    }

    public void setSALARY(int SALARY) {
        this.SALARY = SALARY;
    }

    public int getMTYPE() {
        return MTYPE;
    }

    public void setMTYPE(int MTYPE) {
        this.MTYPE = MTYPE;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    
        public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) 
    {
        ActionErrors errors = new ActionErrors();
        if (getUSERNAME()== null || getUSERNAME().length() < 1) 
        {
            errors.add("username", new ActionMessage("error.username.required"));
        }
        if (getPASSWORD()== null || getPASSWORD().length() < 1) 
        {
            errors.add("password", new ActionMessage("error.password.required"));
        }
        if (getADDRESS()== null || getADDRESS().length() < 1) 
        {
            errors.add("address", new ActionMessage("error.address.required"));
        }
        return errors;
    }
}
