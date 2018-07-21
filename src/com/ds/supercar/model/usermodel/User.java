package com.ds.supercar.model.usermodel;

import java.sql.Date;
import java.util.Set;

public class User {
    private int userid ;
    private String username ;
    private String password ;
    private Date dob ;
    private String gender ;
    private Set<Address> addresses ;

    public User(int userid, String username, String password, Date dob, String gender, Set<Address> addresses) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
        this.addresses = addresses;
    }

    public User(){

    }

    public int getUserid() {
        return userid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
