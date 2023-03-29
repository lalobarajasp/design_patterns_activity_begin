package com.grid.financial;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
//Client created by Factory Method
public class Client {

    private static final String CSV_FILENAME = "taxi-data.csv";


    public static void main(String[] args) throws Exception {
        System.out.println("Financial Report Generation");

        List<Ride> result = new ArrayList<>();

        InputStream inputStream = Client.class.getClassLoader().getResourceAsStream(CSV_FILENAME);
        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);

        for (String rawLine; (rawLine = reader.readLine()) != null;) {
            List<String> line = CSVUtils.parseLine(rawLine);
            Ride newRide = RidesParser.parseFromList(line);
            if(newRide != null) {
                result.add(newRide);
            }
        }

        Report report = SimpleReportFactory.createReport("web", result);
        report.run();
        Report report1 = SimpleReportFactory.createReport("text",result);
        report1.run();

//        CreateReport createReport = new CreateReport();
//        String txtReport = createReport.createContent(result);
//        webReport.createFile(txtReport);
        // System.out.println(htmlReport);

    }
}
