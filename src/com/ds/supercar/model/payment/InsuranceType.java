package com.ds.supercar.model.payment;

public class InsuranceType {
    private int insuranceid ;
    private String insurancedecriptipon;

    public InsuranceType(){

    }

    public InsuranceType(int insuranceid, String insurancedecriptipon) {
        super();
        this.insuranceid = insuranceid;
        this.insurancedecriptipon = insurancedecriptipon;
    }

    public int getInsuranceid() {
        return insuranceid;
    }

    public void setInsuranceid(int insuranceid) {
        this.insuranceid = insuranceid;
    }

    public String getInsurancedecriptipon() {
        return insurancedecriptipon;
    }

    public void setInsurancedecriptipon(String insurancedecriptipon) {
        this.insurancedecriptipon = insurancedecriptipon;
    }
}
