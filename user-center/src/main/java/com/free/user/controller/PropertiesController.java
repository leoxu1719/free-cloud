package com.free.user.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/property")
@RefreshScope
@Api(value = "Propertites Controller", tags = {"配置检测接口"})
public class PropertiesController {

    @Value("${spring.cloud.config.server.default-label}")
    private String label;

    @Value("${title}")
    private String title;


    @GetMapping(value = "/label")
    public String getLabel(){
        return label;
    }

    @GetMapping(value = "/title")
    public String getTitle(){return title;}
}
