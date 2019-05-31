package com.jhooq.springbootapplicationrunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @author Rahul Wagh
 * Example runtime arguments : - nonoptionarg --optionalArg1=Jhooq --optionalArg2=ApplicationRunner
 */
public class SpringBootApplicationRunner implements ApplicationRunner {

    private static Logger LOG = LoggerFactory
            .getLogger(SpringBootApplicationRunner.class);

    public static void main(String[] args) {
        LOG.info("STARTING : Spring boot application starting");
        SpringApplication.run(SpringBootApplicationRunner.class, args);
        LOG.info("STOPPED  : Spring boot application stopped");
    }

    @Override
    public void run(ApplicationArguments args) {
        LOG.info("EXECUTING : Run method of Application Runner");
        final List<String> nonOptionArgs = args.getNonOptionArgs();
        final String[] sourceArgs = args.getSourceArgs();
        final Set<String> optionNames = args.getOptionNames();

        nonOptionArgs.forEach(nonOption -> LOG.info("## Non Option Args : " + nonOption));
        optionNames.forEach(option -> LOG.info("## Option Names    : " + option));
        Arrays.stream(sourceArgs).forEach(srcArgs -> LOG.info("## Source Args     : " + srcArgs));
        LOG.info("## Option Value of --optionalArg1 : " + args.getOptionValues("optionalArg1"));
        LOG.info("## Option Value of --optionalArg2 : " + args.getOptionValues("optionalArg2"));
    }
}