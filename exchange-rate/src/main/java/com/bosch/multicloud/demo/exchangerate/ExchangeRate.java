package com.bosch.multicloud.demo.exchangerate;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class ExchangeRate {

    @Autowired
    private ExchangeRateConfiguration config;

    private static final int MIN_CENTS = 10;

    private final Long seed;
    private final Random random;

    private String rate;

    public ExchangeRate(Long seed) {
        this.seed = seed;
        this.random = new Random(seed);
        this.rate = String.format("1.%d", random.nextInt(MIN_CENTS) + MIN_CENTS);
    }

    public String getFrom() {
        return config.getFrom();
    }

    public String getTo() {
        return config.getTo();
    }

    public String getRate() {
        //Returns a value between 1.10 to 1.20
        return rate;
    }
}
