package Patterns.Decorator;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public interface Report {
    public Object[][]getReportData(final String reportId);
    public String getFirstColumnData();
}
