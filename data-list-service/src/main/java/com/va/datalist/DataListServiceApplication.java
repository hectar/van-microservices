package com.va.datalist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * Created by vaneet_sharma
 */

@Controller
@SpringBootApplication
public class DataListServiceApplication {


    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DataListServiceApplication.class);
    }
}
