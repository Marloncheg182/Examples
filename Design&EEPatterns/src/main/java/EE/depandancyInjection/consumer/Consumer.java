package EE.depandancyInjection.consumer;

/**
 * Created by Dell on 7/28/2015.
 */
public interface Consumer {
    void processMessages(String msg, String rec);
}
