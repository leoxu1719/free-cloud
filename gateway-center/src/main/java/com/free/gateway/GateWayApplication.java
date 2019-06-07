package com.free.gateway;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GateWayApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(GateWayApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
