package org.example.bls;

import org.example.ds.FormattedReport;
import org.example.ds.Report;
import org.springframework.stereotype.Component;

@Component
public class ReportFormatter {

    public FormattedReport formattedReport(Report report) throws InterruptedException {

        System.out.printf("%s's format(Report report) is invokes",
                this.getClass().getSimpleName());
        System.out.println();

        Thread.sleep(5000);

        System.out.printf("%s's format(Report report) is end",
                this.getClass().getSimpleName());
        System.out.println();

        return new FormattedReport(report);
    }


}
