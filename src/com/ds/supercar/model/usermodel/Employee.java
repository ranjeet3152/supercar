package com.ds.supercar.model.usermodel;

import com.ds.supercar.model.places.Branch;

import java.util.Date;

public class Employee extends User{
    private Date jondate ;
    private String role ;
    private Branch branch ;

    public Employee(Date jondate, String role, Branch branch) {
        this.jondate = jondate;
        this.role = role;
        this.branch = branch;
    }

    public Employee(){

    }

    public Date getJondate() {
        return jondate;
    }

    public void setJondate(Date jondate) {
        this.jondate = jondate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
