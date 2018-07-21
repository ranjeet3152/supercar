package com.ds.supercar.model.payment;

import java.util.Date;

public class DemandDraft {
    private int ddnumber;
    private String bankname;
    private long amount;
    private Date deposit_date;
    private Date expiry_date;
    private String branch ;
    private Payment payment; //many-to-one

    public DemandDraft(){

    }

    public DemandDraft(String branch) {
        this.branch = branch;
    }

    public DemandDraft(int ddnumber, String bankname, int amount, Date deposit_date, Date expiry_date, Payment payment) {
        super();
        this.ddnumber = ddnumber;
        this.bankname = bankname;
        this.amount = amount;
        this.deposit_date = deposit_date;
        this.expiry_date = expiry_date;
        this.payment = payment;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getDdnumber() {
        return ddnumber;
    }

    public void setDdnumber(int ddnumber) {
        this.ddnumber = ddnumber;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDeposit_date() {
        return deposit_date;
    }

    public void setDeposit_date(Date deposit_date) {
        this.deposit_date = deposit_date;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
