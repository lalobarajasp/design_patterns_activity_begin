package com.grid.financial.factory.template;

import com.grid.financial.Ride;

import java.io.IOException;
import java.util.List;

//Factory Method (instead of Interface) as well
public abstract class  Report {
    List<Ride> rides;

    //------Template Design Pattern--------------------------
    String content;
    abstract String createTableHeaders();
    abstract String addRide(Ride ride);
    abstract void createFile(String content) throws IOException;
    abstract String createContent ();

    //Template Method
    public void run(){
        createContent();
        try {
            createFile(this.content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //--------------------------------------------------
    public Report(List<Ride> rides) {
        this.rides = rides;

    }


}
