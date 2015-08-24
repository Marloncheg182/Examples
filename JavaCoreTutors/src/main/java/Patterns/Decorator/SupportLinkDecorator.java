package Patterns.Decorator;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class SupportLinkDecorator extends ColumnDecorator {
    public SupportLinkDecorator(Report report) {
        super(report);
    }

    @Override
    public String getFirstColumnData() {
        return addMoreInfo(super.getFirstColumnData());
    }

    public String addMoreInfo(String data){
        return data + " - support ling -";
    }
}
