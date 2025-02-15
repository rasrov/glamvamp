package com.glamvamp.controller.health_check;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HealthCheckGetController {

    @GetMapping("/health-check")
    public ResponseEntity<HashMap<String, String>> index() {
        HashMap<String, String> status = new HashMap<>();
        status.put("application", "glamvamp_backend");
        status.put("status", "ok");

        return new ResponseEntity<>(status, HttpStatus.OK);
    }

}
