package com.grid.financial.factory;

import com.grid.financial.factory.template.PrintedReport;
import com.grid.financial.factory.template.Report;
import com.grid.financial.Ride;
import com.grid.financial.factory.template.WebReport;

import java.util.List;

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
