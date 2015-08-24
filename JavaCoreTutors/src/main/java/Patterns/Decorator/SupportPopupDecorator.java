package Patterns.Decorator;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class SupportPopupDecorator extends ColumnDecorator {
    public SupportPopupDecorator(Report report) {
        super(report);
    }

    @Override
    public String getFirstColumnData() {
        return addPopup(super.getFirstColumnData());
    }

    private String addPopup(String data){
        return data + " - support popup -";
    }
}
