package com.example.xCodeSoftwareTask;

import java.io.Console;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "numbers/sort-command")
public class Endpoint2 {
    
    @PostMapping
    public Numbers sort(@RequestBody Numbers numbers)
    {
        try
        {
            numbers.quickSortInit();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return numbers;
    }
}
