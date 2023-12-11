package org.example.action;

import org.example.bls.ReportFormatter;
import org.example.bls.ReportProvider;
import org.example.bls.ReportRepository;
import org.example.ds.FormattedReport;
import org.example.ds.Report;
import org.example.logging.PerformanceLogger;
import org.example.logging.PerformanceLogger.PerFormaceLoggerInfo;
import org.springframework.stereotype.Component;

import  static  org.example.logging.PerformanceLogger.*;

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


        PerformanceLogger logger = new PerformanceLogger();
        PerFormaceLoggerInfo perFormaceLoggerInfo = logger.start("Providing reports");
        Report report = reportProvider.provideReport();
        logger.end(perFormaceLoggerInfo);

        perFormaceLoggerInfo =logger.start("reportFormatter.format(Report)");
        FormattedReport formattedReport = reportFormatter.formattedReport(report);
        logger.end(perFormaceLoggerInfo);

        perFormaceLoggerInfo = logger.start("reportRepository(report)");
        reportRepository.save(formattedReport);
        logger.end(perFormaceLoggerInfo);

    }
}
