package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;

public class UpdateAF extends org.apache.struts.action.ActionForm 
{
    String USERNAME,PASSWORD,ADDRESS;
    String GENDER;
    int SALARY,MTYPE,ID;
    
    

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


}
