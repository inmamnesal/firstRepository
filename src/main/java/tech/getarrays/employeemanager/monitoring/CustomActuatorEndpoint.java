package tech.getarrays.employeemanager.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id = "test")
@Component
public class CustomActuatorEndpoint {

    @ReadOperation
    public Map<String, String> customEndpoint(String username){
        Map<String, String> map = new HashMap<>();
        map.put("Key", "Value");
        map.put("Username", username);
        map.put("Surname", "Sidorov");
        map.put("email", "sidorov@mail.com");
        map.put("dob", "01.02.1989");

        return map;
    }
}
