package com.grid.financial;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class WebReport {

    //What specific task does this method do?
    public String createContent(List<Ride> rides) {
        StringBuilder builder = new StringBuilder();
        builder.append(createHeaders("Taxi Report"));
        builder.append(createTableHeaders());
        rides.forEach( ride -> {
            builder.append(addRide(ride));
        });
        builder.append(closeTableHeaders());

        return builder.toString();
    }


    //The Java IOException is a checked exception that must be handled at compilation time.
    //The most common cause due to which an IOException is thrown is attempting to access a file that does not exist at the specified location.


    //Why used this exception if we know where is the file located?
    //What other functionality this method has?
    public void createFile(String content) throws IOException {
        FileWriter fileWriter = new FileWriter("financial-report.html");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(content);
        printWriter.close();
    }

    //Where is the tittle?
    private String createHeaders(String title){
        return "<h1>" + title + "</h1>";
    }

    //Method for Table headers
    private String createTableHeaders() {
        return "<table>" +
                "<tr>" +
                    "<th> TaxiID </th>" +
                    "<th> Pickup time </th>" +
                    "<th> Dropoff time </th>" +
                    "<th style=\"padding-right:30px;\"> Passenger count </th>" +
                    "<th style=\"padding-right:30px;\"> Trip Distance </th>" +
                    "<th style=\"padding-right:30px;\"> Total amount </th>" +
                "</tr>";
    }

    //Why doesn't it close within the above string?
    private String closeTableHeaders() {
        return "</table>";
    }

    //Method for printing table structure (content)
    private String addRide(Ride ride) {
        return "<tr style=\"height:40px;\">" +
                "<td style=\"padding-right:30px; text-align: center;\">" + ride.getTaxiId() + "</td>" +
                "<td style=\"padding-right:30px; text-align: center;\">" + ride.getPickUpTime() + "</td>" +
                "<td style=\"padding-right:30px; text-align: center;\">" + ride.getDropOffTime() + "</td>" +
                "<td style=\"padding-right:30px; text-align: center;\">" + ride.getPassengerCount() + "</td>" +
                "<td style=\"padding-right:30px; text-align: center;\">" + ride.getTripDistance() + "</td>" +
                "<td style=\"padding-right:30px; text-align: center;\">" + formatAmount(ride.getTollsAmount()) + "</td>" +
                "</tr>";
    }

    //Method for printing red a negative number
    private String formatAmount(double amount) {
        if(amount < 0) {
            return "<span style='color:red'>" + amount + "</span>";
        }
        return Double.toString(amount);
    }
}
