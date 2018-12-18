package com.bosch.multicloud.demo.exchangerate;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeRateConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "currency")
    public ExchangeRateConfigProperties exchangeRateConfigProperties() {
        return new ExchangeRateConfigProperties();
    }

}
