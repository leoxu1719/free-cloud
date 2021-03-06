package com.free.user;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableEurekaClient
@EnableWebFlux
public class UserLauncher {

    public static void main(String[] args){
        new SpringApplicationBuilder(UserLauncher.class).web(WebApplicationType.REACTIVE).run(args);
    }
}
