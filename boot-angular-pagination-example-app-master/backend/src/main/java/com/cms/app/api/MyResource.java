package com.cms.app.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {

    @GetMapping(path = "/ping")
    public ResponseEntity<Map<String, String>> ping() {
        Map<String, String> map = new HashMap<>();
        map.put("ping", "pong");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}