package com.cs544.fire.timesheet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Abel on 2/5/2017.
 */

@Entity
public class Session {
    @Id
    @GeneratedValue
    private long id;


}
