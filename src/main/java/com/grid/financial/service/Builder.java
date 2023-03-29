package com.grid.financial.service;

import java.util.Date;
//Interface created by Builder Method
//Interface by Factory Method
public interface Builder {
    void setTaxiId (long taxiId);
    void setPickUpTime (Date pickUpTime);
    void setDropOffTime (Date dropOffTime);
    void setPassengerCount (int passengerCount);
    void setTripDistance (double tripDistance);
    void setTollsAmount (double tollsAmount);

}
