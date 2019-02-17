package com.bladi.microservice.model;

import java.io.Serializable;

public class LimitConfiguration implements Serializable {

    private int min;
    private int max;


    protected LimitConfiguration(String min, String max){

    }

    public LimitConfiguration(int min, int max) {
        super();
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }



    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
