package Beans.ListBeanPropertyNames;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class ListBeanPropertyNames {
    public static void main(String[] args) throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(Bean.class);

        PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
        for (int i = 0; i < descriptors.length; i++){
            String propName = descriptors[i].getName();
            Class<?> propType = descriptors[i].getPropertyType();
            System.out.println("Property with Name: " + propName + " and Type: " + propType);
        }
    }

    public static class Bean {
        private String property1;
        private int property2;

        public String getProperty1() {
            return property1;
        }

        public void setProperty1(String property1) {
            this.property1 = property1;
        }

        public int getProperty2() {
            return property2;
        }

        public void setProperty2(int property2) {
            this.property2 = property2;
        }
    }
}
