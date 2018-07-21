package com.ds.supercar.model.payment;

import com.ds.supercar.model.vehicle.CarType;

public class DriverCharges {
    private int driverchardeid;
    private CarType carType ;
    private double h_c_p_day;    //extra_charge_per_day
    private double h_c_p_night; //extra_charge_per_night
    private double c_p_day;     //extra_charge_per_day
    private double c_p_night;   //extra_charge_per_night
    private double c_p_week;    //extra_charge_per_week
    private double c_p_month;   //extra_charge_per_month
    private double wait_c_p_min; //waiting_extra_charge_per_minute

    public DriverCharges(){

    }

    public DriverCharges(int driverchardeid, CarType carType, double h_c_p_day, double h_c_p_night, double c_p_day, double c_p_night, double c_p_week, double c_p_month, double wait_c_p_min) {
        this.driverchardeid = driverchardeid;
        this.carType = carType;
        this.h_c_p_day = h_c_p_day;
        this.h_c_p_night = h_c_p_night;
        this.c_p_day = c_p_day;
        this.c_p_night = c_p_night;
        this.c_p_week = c_p_week;
        this.c_p_month = c_p_month;
        this.wait_c_p_min = wait_c_p_min;
    }

    public int getDriverchardeid() {
        return driverchardeid;
    }

    public void setDriverchardeid(int driverchardeid) {
        this.driverchardeid = driverchardeid;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public double getH_c_p_day() {
        return h_c_p_day;
    }

    public void setH_c_p_day(double h_c_p_day) {
        this.h_c_p_day = h_c_p_day;
    }

    public double getH_c_p_night() {
        return h_c_p_night;
    }

    public void setH_c_p_night(double h_c_p_night) {
        this.h_c_p_night = h_c_p_night;
    }

    public double getC_p_day() {
        return c_p_day;
    }

    public void setC_p_day(double c_p_day) {
        this.c_p_day = c_p_day;
    }

    public double getC_p_night() {
        return c_p_night;
    }

    public void setC_p_night(double c_p_night) {
        this.c_p_night = c_p_night;
    }

    public double getC_p_week() {
        return c_p_week;
    }

    public void setC_p_week(double c_p_week) {
        this.c_p_week = c_p_week;
    }

    public double getC_p_month() {
        return c_p_month;
    }

    public void setC_p_month(double c_p_month) {
        this.c_p_month = c_p_month;
    }

    public double getWait_c_p_min() {
        return wait_c_p_min;
    }

    public void setWait_c_p_min(double wait_c_p_min) {
        this.wait_c_p_min = wait_c_p_min;
    }
}
