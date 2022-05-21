package com.skh.tips.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewFeatureController {

    private Logger logger = LogManager.getLogger(NewFeatureController.class);

    @RequestMapping(method = RequestMethod.GET, path = "/newfeature")
    public String getInfo() throws Exception{
        logger.debug("returning new feature response");
       throw new Exception("damn, ran into error !!! ");
    }
}
