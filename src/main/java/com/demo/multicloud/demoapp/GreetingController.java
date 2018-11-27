package com.demo.multicloud.demoapp;

import java.util.concurrent.atomic.AtomicLong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GreetingController {

    private static final String template = "Greetings from service : %s, version: %s";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    BuildProperties buildProperties;

    @RequestMapping("/greeting")
    public Greeting greeting() {
        log.info("Greeting method invoked. Hurray");
        return new Greeting(counter.incrementAndGet(),
                String.format(template, buildProperties.getName(), buildProperties.getVersion()));
    }
}
