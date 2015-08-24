package Interview.String.Reverse;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class UsingStringBuffer {
    public static void main(String[] args) {
        UsingStringBuffer usb = new UsingStringBuffer();
        String name = "Oleg";
        StringBuffer sb = new StringBuffer(name);
        System.out.println("Reverse of Oleg is:" + sb.reverse());
    }
}
