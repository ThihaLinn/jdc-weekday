package org.example.bls;

import org.example.ds.Report;
import org.springframework.stereotype.Component;

@Component
public class ReportProvider {

    public Report provideReport() throws InterruptedException {
        Thread.sleep(3000);
        return new Report();
    }

}
