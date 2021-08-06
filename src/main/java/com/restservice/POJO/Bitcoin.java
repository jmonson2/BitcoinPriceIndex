package com.restservice.POJO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bitcoin {
    private String disclaimer;
    private String rate;

    public Bitcoin(String disclaimer, String rate) {
        this.disclaimer = disclaimer;
        this.rate = rate;
    }
}