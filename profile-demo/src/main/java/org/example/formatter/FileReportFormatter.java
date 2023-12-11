package org.example.formatter;

import org.example.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component @Profile("file")
public class FileReportFormatter implements ReportFormatter{
    @Override
    public Report format(Report report) {
        System.out.println(this.getClass().getSimpleName()+"FileReportFormatter");
        return null;
    }
}
