package org.example.SOLID.Single_responsiblity;

import org.example.SOLID.Single_responsiblity.BadCode.BadReport;
import org.example.SOLID.Single_responsiblity.GoodCode.Report;
import org.example.SOLID.Single_responsiblity.GoodCode.ReportPrinter;
import org.example.SOLID.Single_responsiblity.GoodCode.ReportSaver;

public class SingleResponse {
    public static void main(String[] args) {
        //Defination class should have only one reason to change

        BadReport badReport=new BadReport("bad report title","bad report content");
        badReport.reportPrint();
        badReport.saveReport();


        Report report =new Report("good report title","content");
        ReportPrinter reportPrinter=new ReportPrinter();
        reportPrinter.reportPrint(report);
        ReportSaver reportSaver=new ReportSaver();
        reportSaver.saveReport(report);

    }
}
