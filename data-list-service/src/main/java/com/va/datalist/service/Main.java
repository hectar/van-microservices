package com.va.datalist.service;

import com.va.datalist.domain.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by vaneet_sharma
 */

@EnableAutoConfiguration
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
        Data data = new Data();
        data.setId("1");
        data.setName("test data")
        ;
    }
}
