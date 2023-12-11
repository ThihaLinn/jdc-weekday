package org.example.Repository;

import org.example.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component @Profile("file")
public class FileReportRepository implements ReportRepository{
    @Override
    public Report save(Report report) {
        System.out.println(this.getClass().getSimpleName()+"FileReportRepository");
        return null;
    }
}
