package org.example.action;

import org.example.bls.ReportFormatter;
import org.example.bls.ReportProvider;
import org.example.bls.ReportRepository;
import org.example.ds.FormattedReport;
import org.example.ds.Report;
import org.springframework.stereotype.Component;


@Component
public class ComplexAction {

    private final ReportFormatter reportFormatter;
    private final ReportProvider reportProvider;
    private final ReportRepository reportRepository;

    public ComplexAction(ReportFormatter reportFormatter, ReportProvider reportProvider, ReportRepository reportRepository) {
        this.reportFormatter = reportFormatter;
        this.reportProvider = reportProvider;
        this.reportRepository = reportRepository;
    }

    public void takeAction() throws InterruptedException {


        Report report = reportProvider.provideReport();

        FormattedReport formattedReport = reportFormatter.formattedReport(report);

        reportRepository.save(formattedReport);


    }
}
