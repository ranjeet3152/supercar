package com.ds.supercar.model.usermodel;

public class Address {
    private String email ;
    private long mobile ;
    private String street ;
    private String city ;
    private String state ;
    private String country ;
    private long pin ;

    public Address(String email, long mobile, String street, String city, String state, String country, long pin) {
        this.email = email;
        this.mobile = mobile;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pin = pin;
    }

    public Address(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPin() {
        return pin;
    }

    public void setPin(long pin) {
        this.pin = pin;
    }
}
