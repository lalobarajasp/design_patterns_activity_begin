package com.grid.financial.builder;

import com.grid.financial.Ride;
import com.grid.financial.builder.Builder;

import java.util.Date;
//Class created by Builder Method
public class RideBuilder implements Builder {
    private long taxiId;
    private Date pickUpTime;
    private Date dropOffTime;
    private int passengerCount;
    private double tripDistance;
    private double tollsAmount;


    @Override
    public void setTaxiId(long taxiId) {
        this.taxiId = taxiId;
    }

    @Override
    public void setPickUpTime(Date pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    @Override
    public void setDropOffTime(Date dropOffTime) {
        this.dropOffTime = dropOffTime;
    }

    @Override
    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    @Override
    public void setTripDistance(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public void setTollsAmount(double tollsAmount) {
        this.tollsAmount = tollsAmount;
    }

    public Ride build(){
        return new Ride(taxiId,pickUpTime,dropOffTime,passengerCount,tripDistance,tollsAmount);
    }



}
