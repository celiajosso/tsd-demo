package org.example.tsddemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//TODO - Task 3.1 - Use annotation to indicate this is a REST Controller
@RestController
public class UserEndpoint {

    private final List<User> users = new ArrayList<>();

    //TODO - Task 3.2 - This method should be mapped to HTTP POST with request body
    @PostMapping("/user")
    //TODO - Task 3.3 - An new User should be added to the users list
    //TODO - Task 3.3 - Response should be OK (200) with user ID in JSON format: { "id": 1234 }
    ResponseEntity<?> createUser(@RequestBody User user) {
        this.users.add(user);
        return ResponseEntity.ok(Map.of("id", users.size()));
    }
}
