package com.gla.interfaces.DefaultMethodsinInterfaces;

interface DataExporter {
    void exportCSV();
    void exportPDF();
    // New feature added later
    default void exportToJSON() {
        System.out.println("Exporting data to JSON format.");
    }
}
class ReportExporter implements DataExporter {
    @Override
    public void exportCSV() {
        System.out.println("Exporting data as CSV.");
    }
    @Override
    public void exportPDF() {
        System.out.println("Exporting data as PDF.");
    }
}
public class DataExportFeature {
    public static void main(String[] args) {
        DataExporter exporter = new ReportExporter();
        exporter.exportCSV();
        exporter.exportPDF();
        exporter.exportToJSON();  // Default method
    }
}