package com.jhooq.springboot.devtools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author : Rahul Wagh
 **/
@SpringBootApplication
public class SpringBootDevTools {

    private static Logger LOG = LoggerFactory
            .getLogger(SpringBootDevTools.class);

    public static void main(String[] args) {
        LOG.info("STARTING : Spring boot application starting");
        SpringApplication.run(SpringBootDevTools.class,args);
        LOG.info("Spring boot application");
    }
}