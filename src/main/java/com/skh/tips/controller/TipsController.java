package com.skh.tips.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipsController {

    @RequestMapping(method = RequestMethod.GET, path = "/tips")
    public String getTip() {
        return "{\"tip\" : \"First Tip\"}";
    }
}
