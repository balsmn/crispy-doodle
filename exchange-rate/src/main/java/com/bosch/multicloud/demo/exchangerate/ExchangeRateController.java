package com.bosch.multicloud.demo.exchangerate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ExchangeRateController {

    @Autowired
    BuildProperties buildProperties;

    @Autowired
    ExchangeRate exchangeRate;

    @RequestMapping("/exchangerate")
    public ExchangeRate getExchangeRate() {
        log.info("ExchangeRate service invoked. Hurray");
        return exchangeRate;
    }
}
