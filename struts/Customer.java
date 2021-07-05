package com.myapp.struts;

public class Customer 
{
public int id;
public String username;
public String address;
public int salary;
//char gender;
//int mtype;
//String password;
 public Customer(int id, String username, String address, int salary/*, char gender, int mtype, String password*/) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.salary = salary;
        /*this.gender = gender;
        this.mtype = mtype;
        this.password = password;*/
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

   
    public String toString() {
        return id+" "+username+" "+address+" "+salary;
    }

}
