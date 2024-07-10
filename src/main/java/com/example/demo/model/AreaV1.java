package com.example.demo.model;

import lombok.Data;

@Data
public class AreaV1 {
    private String shape;
    private int area;
    public AreaV1(String rectangle, int i) {
        this.shape = rectangle;
        this.area = i;
    }
}
