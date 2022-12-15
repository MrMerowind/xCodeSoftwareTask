package com.example.xCodeSoftwareTask;
import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "currencies")
public class Endpoint3 {
    
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("get-current-currency-value-command")
    public ResponseEntity<CurrencyResponse> sort(@RequestBody Currency currencyInput) throws IOException
    {
        String url = "http://api.nbp.pl/api/exchangerates/rates/A/" + currencyInput.getCurrency() + "/today?format=json";
        RestTemplate restTemplate = new RestTemplate();
        String nbpr;
        try
        {
            nbpr = restTemplate.getForObject(url.toString(), String.class);
            nbpr = nbpr.substring(nbpr.indexOf("\"mid\":") + 6);
            nbpr = nbpr.substring(0, nbpr.indexOf("}]}"));
        }
        catch(Exception e){nbpr = "0.0";}
        
        CurrencyResponse cr = new CurrencyResponse(Double.parseDouble(nbpr));
        return ResponseEntity.ok(cr);    
    }
}

