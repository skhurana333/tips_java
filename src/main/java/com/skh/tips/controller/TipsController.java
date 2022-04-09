package com.skh.tips.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileReader;
import java.nio.file.*;

@RestController
public class TipsController {

    @Value("${DB_URL:defaultHost}")
    private String db_url;

    @Value("${anotherSystemUrl:defaultUrl}")
    private String anotherSystemUrl;

    @Value("${debugValue:defaultDebugValue}")
    private String debugValue;

    @Value("${maxConnections:dmc}")
    private String maxConnections;

    @Value("${outputDir:defaultOutputDir}")
    private String outputDir ;

    @Value("${kafkaTopicName:defaulKafkaTopicName}")
    private String kafkaTopicName ;

    // secrets injection
    @Value("${db_password:defdbpw}")
    private String dbPassword;
    @Value("${client_secret:defcs}")
    private String clientSecret;

    private Logger logger = LogManager.getLogger(TipsController.class);

    @RequestMapping(method = RequestMethod.GET, path = "/tips")
    public String getTip() {
        logger.debug("returning tips");
        return "{\"tip\" :" + "\""    + db_url +   ":FirstTip,\""  + "}";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/info")
    public String getInfo() {
        logger.debug("returning info");
        return "{\"info1\" :" + "\""    + dbPassword + "\"" +
              "\"info2\" :" + "\""    + clientSecret + "\"" +
            "\",Warning\":"  + "\". !!!NEVER DO THIS. ITS ONLY FOR DEMO!!!}\"";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tipsall")
    public String getTipsAll() {
        logger.debug("returning all");
        String data = new StringBuilder()
            .append(db_url)
            .append(",")
            .append(anotherSystemUrl)
            .append(",")
            .append(debugValue)
            .append(",")
            .append(maxConnections)
            .append(",")
            .append(outputDir)
            .append(",")
            .append(kafkaTopicName).toString();

        return "{\"tip\" :" + "\""    + db_url +   ":FirstTip,\"" + data + "}";
    }



}
