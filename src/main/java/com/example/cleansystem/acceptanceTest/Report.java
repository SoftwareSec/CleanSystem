package com.example.cleansystem.acceptanceTest;

import java.lang.reflect.Field;
import java.util.List;

public class Report {
    private List<Field> fields;
    private ReportFormat format;

    public Report(List<Field> fields) {
        this.fields = fields;
    }

    public void setDateRange(String dateRange) {
    }

    public void selectFields() {
        // Implementation of selecting fields for the report
    }

    public void setFormat(ReportFormat format) {
        this.format = format;
    }

    public List<Field> getFields() {
        return fields;
    }

    public ReportFormat getFormat() {
        return format;
    }

    public void generate() {
        // Implementation of generating the report
    }
}

