package com.free.config;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigCenterApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(ConfigCenterApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
