package com.ds.supercar.model.usermodel;

public class Driver extends Employee {
    private int driverid ;
    private int licenseid ;

    public Driver(int driverid, int licenseid) {
        this.driverid = driverid;
        this.licenseid = licenseid;
    }

    public Driver(){

    }

    public int getDriverid() {
        return driverid;
    }

    public void setDriverid(int driverid) {
        this.driverid = driverid;
    }

    public int getLicenseid() {
        return licenseid;
    }

    public void setLicenseid(int licenseid) {
        this.licenseid = licenseid;
    }
}
