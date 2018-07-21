package com.ds.supercar.model.transaction;

import com.ds.supercar.model.vehicle.Car;

import java.util.Date;

public class CarForSaleRecord {
    private int carid ;
    private Date dateofadded ;
    private long sellingprice ;
    private Car car ;
    private String branchlocation ;
    private int speedoreading ;

    public CarForSaleRecord(int carid, Date dateofadded, long sellingprice, Car car, String branchlocation, int speedoreading) {
        this.carid = carid;
        this.dateofadded = dateofadded;
        this.sellingprice = sellingprice;
        this.car = car;
        this.branchlocation = branchlocation;
        this.speedoreading = speedoreading;
    }

    public CarForSaleRecord(){

    }

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public Date getDateofadded() {
        return dateofadded;
    }

    public void setDateofadded(Date dateofadded) {
        this.dateofadded = dateofadded;
    }

    public long getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(long sellingprice) {
        this.sellingprice = sellingprice;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getBranchlocation() {
        return branchlocation;
    }

    public void setBranchlocation(String branchlocation) {
        this.branchlocation = branchlocation;
    }

    public int getSpeedoreading() {
        return speedoreading;
    }

    public void setSpeedoreading(int speedoreading) {
        this.speedoreading = speedoreading;
    }
}
