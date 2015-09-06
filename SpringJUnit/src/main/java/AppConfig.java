import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Oleg Romanenchuk on 8/30/2015.
 */
@Configuration
public class AppConfig {
    @Bean
    public SampleService getSampleService(){
        return new SampleServiceIml();
    }
}
