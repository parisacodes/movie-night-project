package com.parisa.movienight;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:5174")
@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<>();
        map.put("message", "Hello from Spring!");
        return map;
    }
}
