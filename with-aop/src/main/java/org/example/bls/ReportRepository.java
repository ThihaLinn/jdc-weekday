package org.example.bls;

import org.example.aspect.PerformanceLogger;
import org.example.ds.FormattedReport;
import org.springframework.stereotype.Component;

@Component
public class ReportRepository {

    @PerformanceLogger
    public void save(FormattedReport formattedReport) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(this.getClass().getSimpleName()+":: successfully saved.");
    }
}
