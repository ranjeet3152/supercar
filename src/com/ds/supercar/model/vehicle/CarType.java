package com.ds.supercar.model.vehicle;

public class CarType {
    private String cartypeid;
    private String cartypename;
    private String cartypedescr;

    public CarType(){

    }

    public CarType(String cartypeid, String cartypename, String cartypedescr) {
        super();
        this.cartypeid = cartypeid;
        this.cartypename = cartypename;
        this.cartypedescr = cartypedescr;
    }

    public String getCartypeid() {
        return cartypeid;
    }

    public void setCartypeid(String cartypeid) {
        this.cartypeid = cartypeid;
    }

    public String getCartypename() {
        return cartypename;
    }

    public void setCartypename(String cartypename) {
        this.cartypename = cartypename;
    }

    public String getCartypedescr() {
        return cartypedescr;
    }

    public void setCartypedescr(String cartypedescr) {
        this.cartypedescr = cartypedescr;
    }
}
