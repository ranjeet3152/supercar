package com.ds.supercar.model.transaction;

import com.ds.supercar.model.payment.Payment;
import com.ds.supercar.model.usermodel.User;

import java.util.Date;

public class CarSellingRecord {
    private int carsaleid ;
    private User user ;
    private Payment payment ;
    private Date sellingdate ;
    private CarForSaleRecord carForSaleRecord ;

    public CarSellingRecord(int carsaleid, User user, Payment payment, Date sellingdate, CarForSaleRecord carForSaleRecord) {
        this.carsaleid = carsaleid;
        this.user = user;
        this.payment = payment;
        this.sellingdate = sellingdate;
        this.carForSaleRecord = carForSaleRecord;
    }

    public CarSellingRecord(){

    }

    public int getCarsaleid() {
        return carsaleid;
    }

    public void setCarsaleid(int carsaleid) {
        this.carsaleid = carsaleid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Date getSellingdate() {
        return sellingdate;
    }

    public void setSellingdate(Date sellingdate) {
        this.sellingdate = sellingdate;
    }

    public CarForSaleRecord getCarForSaleRecord() {
        return carForSaleRecord;
    }

    public void setCarForSaleRecord(CarForSaleRecord carForSaleRecord) {
        this.carForSaleRecord = carForSaleRecord;
    }
}
