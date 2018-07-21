package com.ds.supercar.model.vehicle;

import com.ds.supercar.model.payment.VehicleCharge;
import com.ds.supercar.model.places.Branch;
import com.ds.supercar.model.vehicle.CarType;
import com.ds.supercar.model.vehicle.FuelType;

import java.util.Date;

public class Car {
    private int carid;
    private String carname;
    private String reg_number;
    private Date dateofadded;
    private Date modelyear;
    private CarType carType;
    private FuelType fuelType;
    private byte availability_flag;
    private Branch branch ;

    public Car(){

    }

    public Car(int carid, String carname, String reg_number, Date dateofadded, Date modelyear, CarType carType, FuelType fuelType, byte availability_flag, Branch branch) {
        this.carid = carid;
        this.carname = carname;
        this.reg_number = reg_number;
        this.dateofadded = dateofadded;
        this.modelyear = modelyear;
        this.carType = carType;
        this.fuelType = fuelType;
        this.availability_flag = availability_flag;
        this.branch = branch;
    }

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getReg_number() {
        return reg_number;
    }

    public void setReg_number(String reg_number) {
        this.reg_number = reg_number;
    }

    public Date getDateofadded() {
        return dateofadded;
    }

    public void setDateofadded(Date dateofadded) {
        this.dateofadded = dateofadded;
    }

    public Date getModelyear() {
        return modelyear;
    }

    public void setModelyear(Date modelyear) {
        this.modelyear = modelyear;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public byte getAvailability_flag() {
        return availability_flag;
    }

    public void setAvailability_flag(byte availability_flag) {
        this.availability_flag = availability_flag;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
