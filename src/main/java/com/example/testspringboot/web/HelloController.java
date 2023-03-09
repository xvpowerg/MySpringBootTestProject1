package com.example.testspringboot.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class HelloController
{
    //@RequestMapping("say")
    //@RequestMapping(value = "say", method = RequestMethod.POST)
    //可以用PostMapping代替RequestMapping
    @PostMapping("/say")
    public String hello()
    {
        return "Hello World!";
    }
}
