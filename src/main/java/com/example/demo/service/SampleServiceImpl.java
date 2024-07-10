package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public String first() {
        return "This is First";
    }

    @Override
    public String second() {
        return "This is Second";
    }

    @Override
    public String third() {
        return "This is Third";
    }

}
