package com.grid.financial;

import java.util.List;

//Factory Method (instead of Interface)
public abstract class  Report {
    List<Ride> rides;
    public abstract void run();

    public Report(List<Ride> rides) {
        this.rides = rides;

    }


}
