package EE.depandancyInjection.injector;

import EE.depandancyInjection.consumer.Consumer;

/**
 * Created by Dell on 7/28/2015.
 */
public interface MessageServiceInjector {
    public Consumer getConsumer();
}
