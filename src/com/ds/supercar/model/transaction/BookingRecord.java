package com.ds.supercar.model.transaction;

import com.ds.supercar.model.places.Location;
import com.ds.supercar.model.vehicle.Car;
import com.ds.supercar.model.usermodel.User;

import java.util.Date;

public class BookingRecord {
    private int bookingid ;
    private Location source ;
    private Location destination ;
    private User user ;
    private Car car ;
    private Timesheet timesheet ;
    private Date dateofjourney ;
    private int distance ;
    private int numberofpassengers ;
    private byte driver_flag ;
    private byte cofirm_flag ;

    public BookingRecord(int bookingid, Location source, Location destination, User user, Car car, Timesheet timesheet, Date dateofjourney, int distance, int numberofpassengers, byte driver_flag, byte cofirm_flag) {
        this.bookingid = bookingid;
        this.source = source;
        this.destination = destination;
        this.user = user;
        this.car = car;
        this.timesheet = timesheet;
        this.dateofjourney = dateofjourney;
        this.distance = distance;
        this.numberofpassengers = numberofpassengers;
        this.driver_flag = driver_flag;
        this.cofirm_flag = cofirm_flag;
    }

    public BookingRecord(){

    }

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public Location getSource() {
        return source;
    }

    public void setSource(Location source) {
        this.source = source;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Timesheet getTimesheet() {
        return timesheet;
    }

    public void setTimesheet(Timesheet timesheet) {
        this.timesheet = timesheet;
    }

    public Date getDateofjourney() {
        return dateofjourney;
    }

    public void setDateofjourney(Date dateofjourney) {
        this.dateofjourney = dateofjourney;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getNumberofpassengers() {
        return numberofpassengers;
    }

    public void setNumberofpassengers(int numberofpassengers) {
        this.numberofpassengers = numberofpassengers;
    }

    public byte getDriver_flag() {
        return driver_flag;
    }

    public void setDriver_flag(byte driver_flag) {
        this.driver_flag = driver_flag;
    }

    public byte getCofirm_flag() {
        return cofirm_flag;
    }

    public void setCofirm_flag(byte cofirm_flag) {
        this.cofirm_flag = cofirm_flag;
    }


}


