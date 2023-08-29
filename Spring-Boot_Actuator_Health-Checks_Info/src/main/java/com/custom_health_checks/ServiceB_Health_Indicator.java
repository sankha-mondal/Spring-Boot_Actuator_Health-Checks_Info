package com.custom_health_checks;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

//Custom Health Check Information | Step:3

@Component
public class ServiceB_Health_Indicator implements HealthIndicator {

	private final String message_key = "Service B";
	
	  //  http://localhost:8585/users_credentials/actuator/health

	  @Override
	  public Health health() {
	    if (!isRunningServiceB()) {
	    	return Health.down().withDetail(message_key, "Not Available").build();
	    }

	    return Health.up().withDetail(message_key, "Available").build();
	  }

	  private Boolean isRunningServiceB() {
	    Boolean isRunning = false;
	    // Logic Skipped

	    return isRunning;
	  }
	  
}
