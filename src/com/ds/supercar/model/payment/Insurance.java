package com.ds.supercar.model.payment;

import com.ds.supercar.model.vehicle.Car;

import java.util.Date;

public class Insurance {
    private int insuranceid;
    private Car car;   //many-to-one
    private String insurancecompany;
    private Date renewdate;
    private int version;
    private InsuranceType insuranceType;
    private long amount;

    public Insurance(){

    }

    public Insurance(int insuranceid, Car car, String insurancecompany, Date renewdate, int version, InsuranceType insuranceType, long amount) {
        super();
        this.insuranceid = insuranceid;
        this.car = car;
        this.insurancecompany = insurancecompany;
        this.renewdate = renewdate;
        this.version = version;
        this.insuranceType = insuranceType;
        this.amount = amount;
    }

    public int getInsuranceid() {
        return insuranceid;
    }

    public void setInsuranceid(int insuranceid) {
        this.insuranceid = insuranceid;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getInsurancecompany() {
        return insurancecompany;
    }

    public void setInsurancecompany(String insurancecompany) {
        this.insurancecompany = insurancecompany;
    }

    public Date getRenewdate() {
        return renewdate;
    }

    public void setRenewdate(Date renewdate) {
        this.renewdate = renewdate;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public InsuranceType getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
