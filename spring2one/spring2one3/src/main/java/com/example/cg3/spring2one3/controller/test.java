package com.example.cg3.spring2one3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    

    @GetMapping("h2")
    public String h2(){
        return "h2";
    }
}
