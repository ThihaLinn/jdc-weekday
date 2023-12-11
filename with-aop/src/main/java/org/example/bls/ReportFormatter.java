package org.example.bls;

import org.example.aspect.PerformanceLogger;
import org.example.ds.FormattedReport;
import org.example.ds.Report;
import org.springframework.stereotype.Component;

@Component
public class ReportFormatter {

    @PerformanceLogger
    public FormattedReport formattedReport(Report report) throws InterruptedException {

        System.out.printf("%s's format(Report report) is invokes\n",
                this.getClass().getSimpleName());

        Thread.sleep(5000);

        System.out.printf("%s's format(Report report) is end\n",
                this.getClass().getSimpleName());

        return new FormattedReport(report);
    }


}
