package com.bosch.multicloud.demo.exchangerate;

import java.util.concurrent.atomic.AtomicLong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ExchangeRateController {

    private final AtomicLong counter = new AtomicLong();

    @Autowired
    BuildProperties buildProperties;

    @RequestMapping("/exchangerate")
    public ExchangeRate getExchangeRate() {
        log.info("ExchangeRate service invoked. Hurray");
        return new ExchangeRate(counter.incrementAndGet());
    }
}
