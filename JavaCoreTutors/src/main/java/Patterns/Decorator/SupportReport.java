package Patterns.Decorator;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class SupportReport implements Report {
    public Object[][] getReportData(String reportId) {
        return null;
    }

    public String getFirstColumnData() {
        return "Support data";
    }
}
