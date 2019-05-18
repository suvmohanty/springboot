package com.jhooq.springboot.devtools.trigger.file;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author : Rahul Wagh
 **/
@SpringBootApplication
public class SpringBootDevToolsTriggerFileRestart {

    private static Logger LOG = LoggerFactory
            .getLogger(SpringBootDevToolsTriggerFileRestart.class);

    public static void main(String[] args) {

        LOG.info("STARTING : Spring boot application starting");

        SpringApplication.run(SpringBootDevToolsTriggerFileRestart.class, args);
    }
}