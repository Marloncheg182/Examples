import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Oleg Romanenchuk on 8/31/2015.
 */
public class App {
    public static void main(String[] args) {
        String[] str = {"classpath:spring/job-config.xml","classpath:spring/context-config.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(str);
    }
}
