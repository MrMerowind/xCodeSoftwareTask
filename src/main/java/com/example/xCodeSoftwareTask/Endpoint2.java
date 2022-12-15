package com.example.xCodeSoftwareTask;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "numbers")
public class Endpoint2 {
    
    @PostMapping("sort-command")
    public NumbersResponse sort(@RequestBody Numbers numbers)
    {
        NumbersResponse response = new NumbersResponse();
        try
        {
            numbers.quickSortInit();
            response.setNumbers(numbers.getNumbers());
            return response;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
