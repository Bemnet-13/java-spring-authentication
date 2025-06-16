package com.bemnet.security.businessLogic;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/journal")

public class JournalController {
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("My Hello from a Secured endpoint");
    }
}
