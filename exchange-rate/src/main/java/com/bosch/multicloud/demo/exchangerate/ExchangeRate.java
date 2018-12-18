package com.bosch.multicloud.demo.exchangerate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class ExchangeRate {

    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private ExchangeRateConfigProperties exchangeRateConfigProperties;

    private static final int MIN_CENTS = 10;

    private final long seed;
    private final Random random;

    private String from = "dummy";
    private String to = "dummy";
    private String rate;

    public ExchangeRate() {
        this.seed = counter.incrementAndGet();
        this.random = new Random(seed);
    }

    public String getFrom() {
        return exchangeRateConfigProperties.getFrom();
    }

    public String getTo() {
        return exchangeRateConfigProperties.getTo();
    }

    public String getRate() {
        //Returns a value between 1.10 to 1.20
        return String.format("1.%d", random.nextInt(MIN_CENTS) + MIN_CENTS);
    }
}
