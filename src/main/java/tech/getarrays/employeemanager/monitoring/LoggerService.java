package tech.getarrays.employeemanager.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class LoggerService implements HealthIndicator {
    private final String LOGGER_SERVICE = "Database Service";

    @Override
    public Health health() {
        if(isLoggerServiceGood()){
            return Health.up().withDetail(LOGGER_SERVICE,"Service is running" ).build();
        }
        HashMap<String, String> details = new HashMap<>();
        details.put(LOGGER_SERVICE, "Service is not available");
        details.put("Status", "service is andeg contriqoutione");

        //return Health.down().withDetail(LOGGER_SERVICE,"Service is not available" ).build();
        return Health.down().withDetails(details).build();
    }

    private boolean isLoggerServiceGood() {
        return false;
    }
}
