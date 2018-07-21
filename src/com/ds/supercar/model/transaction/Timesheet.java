package com.ds.supercar.model.transaction;

import java.util.Date;

public class Timesheet {
    private int timesheetrecord ;
    private Date fromtime;
    private Date totime;
    private Date fromdate;
    private Date todate ;

    public Timesheet(){

    }
    public Timesheet(int timesheetrecord, Date fromtime, Date totime, Date fromdate, Date todate) {
        super();
        this.timesheetrecord = timesheetrecord;
        this.fromtime = fromtime;
        this.totime = totime;
        this.fromdate = fromdate;
        this.todate = todate;
    }

    public int getTimesheetrecord() {
        return timesheetrecord;
    }

    public void setTimesheetrecord(int timesheetrecord) {
        this.timesheetrecord = timesheetrecord;
    }

    public Date getFromtime() {
        return fromtime;
    }

    public void setFromtime(Date fromtime) {
        this.fromtime = fromtime;
    }

    public Date getTotime() {
        return totime;
    }

    public void setTotime(Date totime) {
        this.totime = totime;
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }
}
