package com.vakulenko.exampleloggenerator.controller;

import com.vakulenko.exampleloggenerator.service.LogGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@RestController
@RequiredArgsConstructor
public class LogController {
    private final LogGenerator generator;

    @GetMapping("/generate")
    public ResponseEntity test(@RequestParam(name = "count", defaultValue = "0") Integer count) {
        log.info("Test request received with count: {}", count);
        generator.generate(count);
        return ResponseEntity.ok("Success!");
    }
}
