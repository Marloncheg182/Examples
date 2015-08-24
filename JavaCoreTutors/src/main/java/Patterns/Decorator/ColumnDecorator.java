package Patterns.Decorator;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public abstract class ColumnDecorator implements Report {
    private Report report;
    public ColumnDecorator(Report report){
        this.report = report;
    }

    public String getFirstColumnData() {
        return report.getFirstColumnData();
    }

    public Object[][] getReportData(String reportId) {
        return report.getReportData(reportId);
    }
}
