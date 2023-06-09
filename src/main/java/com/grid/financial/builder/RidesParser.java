package com.grid.financial.builder;

import com.grid.financial.Ride;
import com.grid.financial.builder.RideBuilder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RidesParser {
  static final String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
  public static Ride parseFromList(List<String> line) {

    Ride newRide = null;

    try {
      long taxiId = Long.parseLong(line.get(0));
      Date pickUpTime = new SimpleDateFormat(DATE_FORMAT).parse(line.get(1));
      Date dropOffTime = new SimpleDateFormat(DATE_FORMAT).parse(line.get(2));
      int passengerCount = Integer.parseInt(line.get(3));
      double tripDistance = Double.parseDouble(line.get(4));
      double totalAmount = Double.parseDouble(line.get(5));

      //Updated by Builder Method
      RideBuilder rideBuilder = new RideBuilder();
      rideBuilder.setTaxiId(taxiId);
      rideBuilder.setPickUpTime(pickUpTime);
      rideBuilder.setDropOffTime(dropOffTime);
      rideBuilder.setPassengerCount(passengerCount);
      rideBuilder.setTripDistance(tripDistance);
      rideBuilder.setTollsAmount(totalAmount);
      newRide = rideBuilder.build();


    } catch (Exception e) {
      System.out.println(e.toString());
    }

    return newRide;
  }

}
