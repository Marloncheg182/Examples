package typeconverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;
import model.Rectangle;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by Dell on 7/26/2015.
 */
public class RectangleTypeConverter extends StrutsTypeConverter {

    @Override
    public Object convertFromString(Map arg0, String[] inputs, Class arg2) {
        String input = inputs[0];
        if(!input.startsWith("R:")) throw new TypeConversionException("invalid input");
        input = input.substring(2);
        String[] dimensions = input.split(",");
        int x = Integer.parseInt(dimensions[0]);
        int y = Integer.parseInt(dimensions[1]);
        Rectangle rect = new Rectangle();
        rect.setX(x);
        rect.setY(y);
        return rect;
    }

    @Override
    public String convertToString(Map arg0, Object obj) {
        Rectangle rect = (Rectangle) obj;
        String output = "R:" + rect.getX() + "," + rect.getY();
        return output;
    }

}
