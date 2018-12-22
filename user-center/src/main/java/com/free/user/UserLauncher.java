package com.free.user;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserLauncher {

    public static void main(String[] args){
        new SpringApplicationBuilder(UserLauncher.class).web(WebApplicationType.SERVLET).run(args);
    }
}
