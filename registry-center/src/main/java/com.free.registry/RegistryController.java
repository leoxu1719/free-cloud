package com.free.registry;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistryController {


    @Value("${title}")
    String title;

    @RequestMapping("/title")
    public String hi(){
        return title;
    }
}
