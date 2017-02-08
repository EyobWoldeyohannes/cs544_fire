package com.cs544.fire.timesheet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Abel on 2/5/2017.
 */

@Entity
public class Location {
    @Id
    private String shortname;
    private String longname;

    public Location(){

    }


    public String getshortname() {
        return shortname;
    }

    public void setShortnamename(String location) {
        this.shortname = location;
    }

    public String getLongname() {
        return longname;
    }


}
