package com.free.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/property")
public class PropertiesController {

    @Value("${spring.cloud.config.server.default-label}")
    private String label;


    @GetMapping(value = "/label")
    public String getLabel(){
        return label;
    }
}
