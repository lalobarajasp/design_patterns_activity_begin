package com.grid.financial;

import java.util.Date;

public interface Builder {
    void setTaxiId (long taxiId);
    void setPickUpTime (Date pickUpTime);
    void setDropOffTime (Date dropOffTime);
    void setPassengerCount (int passengerCount);
    void setTripDistance (double tripDistance);
    void setTollsAmount (double tollsAmount);

}
