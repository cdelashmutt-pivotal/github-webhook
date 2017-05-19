package com.example;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by cdelashmutt on 5/19/17.
 */
//@Component
public class BadHealthIndicator implements HealthIndicator {

	//Just return a down status automatically
	@Override
	public Health health() {
		return Health.down().build();
	}
}
