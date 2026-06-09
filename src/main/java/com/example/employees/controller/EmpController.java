package com.example.employees.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @GetMapping("/")
    public String home(){
        return "Welcome";
    }
}
