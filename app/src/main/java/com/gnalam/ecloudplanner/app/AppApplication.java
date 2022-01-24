package com.gnalam.ecloudplanner.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {
    private static final Logger log = LogManager.getLogger(AppApplication.class);

    public static void main(String[] args) {
        log.info("Starting eCloudPlanner backend");
        SpringApplication.run(AppApplication.class, args);
    }

}
