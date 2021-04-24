package com.fastcampus.javaallinone.project3.mycontact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    *author Martin
    *

 */
@RestController
public class HelloWorldController {

    @PostMapping(value="api/helloWorld")
    public String helloWorld(){
        return "HelloWorld";
    }
}
