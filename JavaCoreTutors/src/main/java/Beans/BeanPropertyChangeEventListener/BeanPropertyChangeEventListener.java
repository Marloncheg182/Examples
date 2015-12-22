package Beans.BeanPropertyChangeEventListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class BeanPropertyChangeEventListener {
    public static void main(String[] args) {
        Bean bean = new Bean();
        bean.addPropertyChangeListener(new MyPropertyChangeListener());

        bean.setProperty1("newProperty1");
        bean.setProperty2(123);

        bean.setProperty1("newNewProperty1");
        bean.setProperty2(234);
    }

    public static class MyPropertyChangeListener implements PropertyChangeListener {
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            System.out.println("Name = " + evt.getPropertyName());
            System.out.println("Old Value = " + evt.getOldValue());
            System.out.println("New Value = " + evt.getNewValue());
            System.out.println("***********************************");
        }
    }

    private static class Bean {

        private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

        private String property1;

        private int property2;

        public String getProperty1() {
            return property1;
        }

        public void setProperty1(String property1) {
            pcs.firePropertyChange("property1", this.property1, property1);
            this.property1 = property1;
        }

        public int getProperty2() {
            return property2;
        }

        public void setProperty2(int property2) {
            pcs.firePropertyChange("property2", this.property2, property2);
            this.property2 = property2;
        }
        public void addPropertyChangeListener(PropertyChangeListener listener){
            pcs.addPropertyChangeListener(listener);

        }

    }
}
