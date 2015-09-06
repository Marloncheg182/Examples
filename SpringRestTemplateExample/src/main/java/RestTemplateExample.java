/**
 * Created by Oleg Romanenchuk on 9/1/2015.
 */
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


public class RestTemplateExample {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/SpringMVCloginExample/jsp/json.jsp";
        List<HttpMessageConverter> messageConverters = new ArrayList<HttpMessageConverter>();
        MappingJackson2HttpMessageConverter map = new MappingJackson2HttpMessageConverter();
        messageConverters.add(map);
        restTemplate.setMessageConverters(messageConverters);
        UserBean bean = restTemplate.getForObject(url,UserBean.class);
        System.out.println("The object recived from Rest call : " + bean);
    }
}
