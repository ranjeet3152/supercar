package com.ds.supercar.model.places;

public class Branch {
    private int branchid;
    private String locationname;
    private String contact;
    private String faxnumber;

    public Branch(){

    }

    public Branch(int branchid, String locationname, String contact, String faxnumber) {
        super();
        this.branchid = branchid;
        this.locationname = locationname;
        this.contact = contact;
        this.faxnumber = faxnumber;
    }

    public int getBranchid() {
        return branchid;
    }

    public void setBranchid(int branchid) {
        this.branchid = branchid;
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getFaxnumber() {
        return faxnumber;
    }

    public void setFaxnumber(String faxnumber) {
        this.faxnumber = faxnumber;
    }
}
