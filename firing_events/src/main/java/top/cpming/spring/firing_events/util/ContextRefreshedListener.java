package top.cpming.spring.firing_events.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {
	private static Logger logger = LoggerFactory.getLogger(ContextRefreshedListener.class);
	private SampleEvent sampleEvent;

	@Autowired
	public void setSampleEvent(SampleEvent sampleEvent) {
		this.sampleEvent = sampleEvent;
	}

	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		logger.info("Context Refreshed");
		sampleEvent.setEventFired(true);
	}
}
