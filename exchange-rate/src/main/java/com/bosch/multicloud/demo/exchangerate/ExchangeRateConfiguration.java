package com.bosch.multicloud.demo.exchangerate;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotNull;

@EnableAutoConfiguration
@Configuration
@ConfigurationProperties(prefix = "currency")
public class ExchangeRateConfiguration {
    @NotNull
    private String from;

    @NotNull
    private String to;

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
