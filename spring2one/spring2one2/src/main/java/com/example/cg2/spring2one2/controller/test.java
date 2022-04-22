package com.example.cg2.spring2one2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    

    @GetMapping("h1")
    public String h1(){
        return "h1";
    }
}
