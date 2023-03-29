package com.grid.financial;

import java.util.Date;
//Factory created by Factory Method
public class Ride{
  //Attributes
  private String error;
  private long taxiId;
  private Date pickUpTime;
  private Date dropOffTime;
  private int passengerCount;
  private double tripDistance;
  private double tollsAmount;

  //Constructor
  public Ride(String error) {
    this.error = error;
  }
  //Constructor
  public Ride(
      long taxiId,
      Date pickUpTime,
      Date dropOffTime,
      int passengerCount,
      double tripDistance,
      double tollsAmount) {
    this.taxiId = taxiId;
    this.pickUpTime = pickUpTime;
    this.dropOffTime = dropOffTime;
    this.passengerCount = passengerCount;
    this.tripDistance = tripDistance;
    this.tollsAmount = tollsAmount;
  }


  //Accessible methods "getters and setters"
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public long getTaxiId() {
    return taxiId;
  }

  public void setTaxiId(long taxiId) {
    this.taxiId = taxiId;
  }

  public Date getPickUpTime() {
    return pickUpTime;
  }

  public void setPickUpTime(Date pickUpTime) {
    this.pickUpTime = pickUpTime;
  }

  public Date getDropOffTime() {
    return dropOffTime;
  }

  public void setDropOffTime(Date dropOffTime) {
    this.dropOffTime = dropOffTime;
  }

  public int getPassengerCount() {
    return passengerCount;
  }

  public void setPassengerCount(int passengerCount) {
    this.passengerCount = passengerCount;
  }

  public double getTripDistance() {
    return tripDistance;
  }

  public void setTripDistance(double tripDistance) {
    this.tripDistance = tripDistance;
  }

  public double getTollsAmount() {
    return tollsAmount;
  }

  public void setTollsAmount(double tollsAmount) {
    this.tollsAmount = tollsAmount;
  }
}
