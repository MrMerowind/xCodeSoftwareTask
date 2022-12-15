package com.example.xCodeSoftwareTask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "status/ping")
public class Endpoint1 {

    @GetMapping
    public String ping()
    {
        return "pong";
    }    
}
