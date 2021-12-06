package com.skh.tips.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipsController {

    @Value("${DB_URL:defaultHost}")
    private String db_url;

    @Value("${anotherSystemUrl:defaultUrl}")
    private String anotherSystemUrl;
    
    @RequestMapping(method = RequestMethod.GET, path = "/tips")
    public String getTip() {
        return "{\"tip\" :" + "\""    + db_url +   ":FirstTip,\"" + anotherSystemUrl + "}";
    }
}
