package com.free.user.controller;

import com.free.user.vo.UserInfoVO;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping(value = "/property")
//@RefreshScope
//@Api(value = "Propertites Controller", tags = {"配置检测接口"})
public class PropertiesController {

//    @Value("${spring.cloud.config.server.default-label}")
//    private String label;
//
//    @Value("${title}")
//    private String title;
//
//
//    @GetMapping(value = "/label")
//    public String getLabel(){
//        return label;
//    }

    @PostMapping(value = "/title")
    public UserInfoVO getTitle(@RequestBody UserInfoVO vo){return vo;}
}
