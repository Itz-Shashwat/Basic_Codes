package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class WorkController{
    @GetMapping("/work")
    public int something(@RequestParam int num1, @RequestParam int num2){
        return num1+num2;
    }
}
