package top.cpming.spring.firing_events.util;

import org.springframework.stereotype.Component;

@Component
public class SampleEvent {
	private Boolean eventFired = false;

	public Boolean getEventFired() {
		return eventFired;
	}

	public void setEventFired(Boolean eventFired) {
		this.eventFired = eventFired;
	}
}
