package com.example.javafromscratch;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloClass {

    @RequestMapping(value="/hello/{id}",method= RequestMethod.GET)
    public String sayHello(@PathVariable("id") String id ) {
        return "Hello"+" " +id+" "+ "Welcome to my world";
    }

}
