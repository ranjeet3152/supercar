package com.ds.supercar.model.payment;

import java.util.Date;

public class Payment {
    private int paymentid;
    private long amount;
    private Date txtime;
    private PaymentType paymentType;

    public Payment(){

    }
    public Payment(int paymentid, long amount, Date txtime, PaymentType paymentType) {
        super();
        this.paymentid = paymentid;
        this.amount = amount;
        this.txtime = txtime;
        this.paymentType = paymentType;
    }

    public int getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Date getTxtime() {
        return txtime;
    }

    public void setTxtime(Date txtime) {
        this.txtime = txtime;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
