package com.cs544.fire.timesheet.model;

import java.util.Date;

/**
 * Created by Abel on 2/8/2017.
 */
public class tempAtt {

        public Date sessiondate;
        public String timeslot;
        public String offeringid;
        public boolean attendance;
    public tempAtt(){

    }

    public Date getSessiondate() {
        return sessiondate;
    }

    public void setSessiondate(Date sessiondate) {
        this.sessiondate = sessiondate;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    public String getOfferingid() {
        return offeringid;
    }

    public void setOfferingid(String offeringid) {
        this.offeringid = offeringid;
    }

    public boolean isAttendance() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }
}
