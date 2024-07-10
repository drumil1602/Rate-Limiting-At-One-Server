package com.example.demo.controller;

import com.example.demo.model.AreaV1;
import com.example.demo.model.RectangleDimensionsV1;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AreaCalculationController {

    @PostMapping(value = "/api/v1/area/rectangle")
    public ResponseEntity<AreaV1> rectangle(@RequestBody RectangleDimensionsV1 dimensions) {
        return ResponseEntity.ok(
                new AreaV1("rectangle",
                dimensions.getLength() * dimensions.getWidth())
        );
    }
}

