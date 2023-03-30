package com.grid.financial.clientTest;

import com.grid.financial.*;
import com.grid.financial.context.ContextTypeFile;
import com.grid.financial.implementation.CSVFileReadAndParse;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
//Client created by Factory Method
public class Client {
   // private final String CSV_FILENAME = "taxi-data.csv";


    public static void main(String[] args) throws Exception {
        System.out.println("Financial Report Generation");


        ContextTypeFile contextTypeFile = new ContextTypeFile(new CSVFileReadAndParse("taxi-data.csv"));
        List<Ride> result = contextTypeFile.readAndParseData();

        //Modified by Method Factory
        Report report = SimpleReportFactory.createReport("web",result);
        report.run();
        Report report1 = SimpleReportFactory.createReport("text",result);
        report1.run();


//        CreateReport createReport = new CreateReport();
//        String txtReport = createReport.createContent(result);
//        webReport.createFile(txtReport);
        // System.out.println(htmlReport);

    }
}
