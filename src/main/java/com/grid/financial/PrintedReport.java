package com.grid.financial;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class PrintedReport extends Report{

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




//    public String createContent(){
//        return null;
//    }

    public String createContent() {
        StringBuilder builder = new StringBuilder();
        builder.append(createHeaders("Taxi Report"));
        builder.append(createTableHeaders());
        rides.forEach( ride -> {
            builder.append(addRide(ride));
        });

        return builder.toString();
    }


    //The Java IOException is a checked exception that must be handled at compilation time.
    //The most common cause due to which an IOException is thrown is attempting to access a file that does not exist at the specified location.

    public void createFile(String content) throws IOException {
        FileWriter fileWriter = new FileWriter("financial-report.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(content);
        printWriter.close();
    }

    //Where is the tittle?
    //Changed private method "createHeaders" by public
    public String createHeaders(String title){
        return title + "\n" + "\n";
    }

    //Method for Table headers
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

    //Method for printing red a negative number
    public String formatAmount(double amount) {
        if(amount < 0) {
            return "\t" + "(" + amount + ")";
        }
        return Double.toString(amount);
    }



}
