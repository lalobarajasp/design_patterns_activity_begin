package com.grid.financial;

import java.util.List;
//Method Factory
public class SimpleReportFactory {
    public static Report createReport(String criteria, List<Ride> rides){

        if(criteria.equals("web")){
            WebReport webReport = new WebReport(rides);
            return  webReport;
        }else if(criteria.equals("text")){
            PrintedReport printedReport = new PrintedReport(rides);
            return printedReport;
        }
        return null;
    }


}
