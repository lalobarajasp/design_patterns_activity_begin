package com.grid.financial.clientTest;

import com.grid.financial.*;
import com.grid.financial.strategy.ContextTypeFile;
import com.grid.financial.factory.SimpleReportFactory;
import com.grid.financial.strategy.CSVFileReadAndParse;
import com.grid.financial.factory.template.Report;

import java.util.List;
//Client created by Factory Method
public class Client {
    public static void main(String[] args) throws Exception {

        System.out.println("Financial Report Generation");

        //Modified by Strategy Method
        ContextTypeFile contextTypeFile = new ContextTypeFile(new CSVFileReadAndParse("taxi-data.csv"));
        List<Ride> result = contextTypeFile.readAndParseData();

        //Modified by Factory Method
        Report report = SimpleReportFactory.createReport("web",result);
        report.run();
        Report report1 = SimpleReportFactory.createReport("text",result);
        report1.run();

    }
}
