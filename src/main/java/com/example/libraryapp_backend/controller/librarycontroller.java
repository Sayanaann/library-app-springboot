package com.example.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class librarycontroller {

    @GetMapping("/")
    public String Homepage(){
        return "welcome to libraryapp";
    }
}


