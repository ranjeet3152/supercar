package com.ds.supercar.model.payment;

import java.util.Date;

public class Coupons {
    private int couponid;
    private double min_amount;
    private double max_amount ;
    private double discount_amount ;
    private Date valid_upto;

    public Coupons(){
    }

    public Coupons(int couponid, double min_amount, double max_amount, double discount_amount, Date valid_upto) {
        super();
        this.couponid = couponid;
        this.min_amount = min_amount;
        this.max_amount = max_amount;
        this.discount_amount = discount_amount;
        this.valid_upto = valid_upto;
    }

    public int getCouponid() {
        return couponid;
    }

    public void setCouponid(int couponid) {
        this.couponid = couponid;
    }

    public double getMin_amount() {
        return min_amount;
    }

    public void setMin_amount(double min_amount) {
        this.min_amount = min_amount;
    }

    public double getMax_amount() {
        return max_amount;
    }

    public void setMax_amount(double max_amount) {
        this.max_amount = max_amount;
    }

    public double getDiscount_amount() {
        return discount_amount;
    }

    public void setDiscount_amount(double discount_amount) {
        this.discount_amount = discount_amount;
    }

    public Date getValid_upto() {
        return valid_upto;
    }

    public void setValid_upto(Date valid_upto) {
        this.valid_upto = valid_upto;
    }
}
