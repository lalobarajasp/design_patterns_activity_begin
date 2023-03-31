package com.grid.financial.factory.template;

import com.grid.financial.Ride;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
//Method Factory as well
public class PrintedReport extends Report {

    @Override
    public void run() {
       // this.createContent();
        String txtReport = this.createContent();
        try {
            this.createFile(txtReport);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PrintedReport(List<Ride> rides) {
        super(rides);

    }

    public String createContent() {
        StringBuilder builder = new StringBuilder();
        builder.append(createHeaders("Taxi Report"));
        builder.append(createTableHeaders());
        rides.forEach( ride -> {
            builder.append(addRide(ride));
        });

        return builder.toString();
    }

    public void createFile(String content) throws IOException {
        FileWriter fileWriter = new FileWriter("financial-report.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(content);
        printWriter.close();
    }

    public String createHeaders(String title){
        return title + "\n" + "\n";
    }

    public String createTableHeaders() {
        return "TaxiID" +"\t"+
                "Pickup                        " +"\t"+
                "Dropoff time                  " +"\t"+
                "Passenger count" +"\t"+
                "   Trip Distance" +"\t"+
                "Total amount"+"\n";
    }

    public String addRide(Ride ride) {
        return ride.getTaxiId() + "\t" +
                ride.getPickUpTime() + "\t" +
                ride.getDropOffTime() + "\t" +"\t" +
                ride.getPassengerCount() + "\t" +"\t" +
                ride.getTripDistance() + "\t" +"\t" +
                formatAmount(ride.getTollsAmount()) + "\t" + "\n";
    }

    public String formatAmount(double amount) {
        if(amount < 0) {
            return "\t" + "(" + amount + ")";
        }
        return Double.toString(amount);
    }



}
