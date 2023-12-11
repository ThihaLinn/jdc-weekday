package org.example.service;

import org.example.Repository.ReportRepository;
import org.example.ds.Report;
import org.example.formatter.ReportFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionService {

    private  final ReportFormatter reportFormatter;


    private final ReportRepository reportRepository;

    public ActionService(ReportFormatter reportFormatter, ReportRepository reportRepository) {
        this.reportFormatter = reportFormatter;
        this.reportRepository = reportRepository;
    }

    public void takeAction(){
        Report report = new Report();
        Report formattedReport = reportFormatter.format(report);
        reportRepository.save(formattedReport);
    }

}
