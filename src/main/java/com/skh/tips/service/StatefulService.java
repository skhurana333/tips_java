package com.skh.tips.service;

import org.springframework.stereotype.Service;

@Service
public class StatefulService {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
