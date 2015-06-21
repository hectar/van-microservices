package com.va.datalist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hectar on 20/06/15.
 */
//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableHystrix
@EnableEurekaClient
public class DataListApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DataListApplication.class);
//        DataRepository dataRepository = ctx.getBean("dataRepository");

    }


    @Bean
    @RefreshScope
    void refreshScope(@Value("${van-prop-2}") String[] exclamations) {
        System.out.println("in refresh scope");

    }


}


