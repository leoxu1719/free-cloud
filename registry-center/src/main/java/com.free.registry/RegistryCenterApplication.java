package com.free.registry;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryCenterApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(RegistryCenterApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
