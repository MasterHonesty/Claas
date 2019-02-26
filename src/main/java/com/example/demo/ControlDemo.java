package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlDemo {

    @RequestMapping(value = "/hello")
    public String test(@RequestParam String name){
        return name + "!hello word!";
    }
}
