package com.ds.supercar.model.vehicle;
public class FuelType {
    private int fueltypeid;
    private String fueltypename;
    private String fueltypedescr;

    public FuelType(){

    }

    public FuelType(int fueltypeid, String fueltypename, String fueltypedescr) {
        super();
        this.fueltypeid = fueltypeid;
        this.fueltypename = fueltypename;
        this.fueltypedescr = fueltypedescr;
    }

    public int getFueltypeid() {
        return fueltypeid;
    }

    public void setFueltypeid(int fueltypeid) {
        this.fueltypeid = fueltypeid;
    }

    public String getFueltypename() {
        return fueltypename;
    }

    public void setFueltypename(String fueltypename) {
        this.fueltypename = fueltypename;
    }

    public String getFueltypedescr() {
        return fueltypedescr;
    }

    public void setFueltypedescr(String fueltypedescr) {
        this.fueltypedescr = fueltypedescr;
    }
}
