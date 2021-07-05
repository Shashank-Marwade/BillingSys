package com.ciit;

public class Customer 
{
int id;
String username;
String address;
int salary;
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

    public String toString() {
        return id+" "+username+" "+address+" "+salary;
    }

}
