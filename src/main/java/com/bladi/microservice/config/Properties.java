package com.bladi.microservice.config;

import org.springframework.beans.factory.annotation.Value;

public class Properties {
    @Value("${limits-service.minimum}")
    private String min;


    @Value("${limits-service.maximum}")
    private String max;

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }
}
