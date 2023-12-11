package org.example.formatter;

import org.example.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component @Profile("db")
public class DbReportFormatter implements ReportFormatter {


    @Override
    public Report format(Report report) {
        System.out.println(this.getClass().getSimpleName()+"DbReportFormatter");
        return null;
    }
}
