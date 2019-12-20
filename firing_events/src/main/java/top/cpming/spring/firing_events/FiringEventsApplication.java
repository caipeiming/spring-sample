package top.cpming.spring.firing_events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import top.cpming.spring.firing_events.util.ContextRefreshedListener;
import top.cpming.spring.firing_events.util.SampleEvent;

@SpringBootApplication
public class FiringEventsApplication {
    private static Logger logger = LoggerFactory.getLogger(FiringEventsApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(FiringEventsApplication.class, args);
        SampleEvent bean = ctx.getBean(SampleEvent.class);
        logger.info("Is Event Fired : {}", bean.getEventFired());
    }

}
