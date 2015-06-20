package com.va.datalist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by hectar on 20/06/15.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class);
//        DataRepository dataRepository = ctx.getBean("dataRepository");

    }


}


