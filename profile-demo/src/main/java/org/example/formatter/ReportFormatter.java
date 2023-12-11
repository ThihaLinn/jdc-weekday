package org.example.formatter;

import org.example.Repository.ReportRepository;
import org.example.ds.Report;

public interface ReportFormatter {

    Report format(Report report);

}
