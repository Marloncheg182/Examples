package Beans.GetSetBeanProperty;

import java.beans.Expression;
import java.beans.Statement;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class GetSetBeanProperty {
    public static void main(String[] args) throws Exception {
        Object o = new Bean();
        Statement stmt;
        Expression expr;

        // Set the Value of Property 1

        stmt = new Statement(o, "setProperty1", new Object[]{"My Prop Value"});
        stmt.execute();

        // Get the Value of Property 1

        expr = new Expression(o, "getProperty1", new Object[0]);
        expr.execute();
        System.out.println("Property 1 value is : " + expr.getValue());

        // Set the Value of Property 2
        stmt = new Statement(0, "setProperty2", new Object[]{"My Prop Value"});
        stmt.execute();

        // Get the Value of Property 2

        expr = new Expression(o, "getProperty2", new Object[0]);
        expr.execute();
        System.out.println("Property 2 value is: " + expr.getValue());
    }

    private static class Bean {
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
