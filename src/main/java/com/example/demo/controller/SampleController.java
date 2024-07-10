package com.example.demo.controller;

import com.example.demo.service.SampleService;
import com.example.demo.utils.WithRateLimitProtection;
import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Refill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
public class SampleController {

//    private final Bucket bucket;
//
//    public SampleController() {
//        Bandwidth limit = Bandwidth.classic(2, Refill.greedy(2, Duration.ofMinutes(1)));
//        this.bucket = Bucket.builder()
//                .addLimit(limit)
//                .build();
//    }

    @Autowired
    private SampleService service;

    @GetMapping("/first")
//    @RateLimiter(name="rateLimiterApi")
    @WithRateLimitProtection
    public ResponseEntity<String> first(){
        System.out.println("We are insdie controller");
//        if( bucket.tryConsume(1) ) {
            String response = service.first();
            return ResponseEntity.ok(response);
//        }else{
//            return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).build();
//        }
    }

    @GetMapping("/second")
    @WithRateLimitProtection
    public ResponseEntity<String> second(){
        String response = service.second();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/third")
    public ResponseEntity<String> third(){
        String response = service.third();
        return ResponseEntity.ok(response);
    }
}
