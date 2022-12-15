package com.example.xCodeSoftwareTask;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/currencies")
public class Endpoint3 {
    
    @PostMapping("get-current-currency-value-command")
    public CurrencyResponse sort(@RequestBody Currency currencyInput)
    {
        RestTemplate restTemplate = new RestTemplate();

        CurrencyResponse response = new CurrencyResponse();
        NBPResponse nbpResponse = null;

        try
        {
            nbpResponse = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/tables/A?format=json", NBPResponse.class);

            for(int i = 0; i < nbpResponse.getRates().length; i++)
            {
                if(nbpResponse.getRates()[i].getCode() == currencyInput.getCurrency())
                {
                    response.setValue(nbpResponse.getRates()[i].getMid());
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return response;
    }
}

