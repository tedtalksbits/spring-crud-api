package com.tblake.crudapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping
    public String getHome(){
        return "<h1>Welcome to the home page</h1> <p>Use /api/v1/accounts to get a list of accounts</p>";
    }

}
