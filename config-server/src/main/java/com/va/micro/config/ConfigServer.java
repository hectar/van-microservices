package com.va.micro.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hectar on 20/06/15.
 */

@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class ConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class);

    }
}
