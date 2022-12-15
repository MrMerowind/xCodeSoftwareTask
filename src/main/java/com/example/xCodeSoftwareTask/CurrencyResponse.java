package com.example.xCodeSoftwareTask;


public class CurrencyResponse {
    private double value;

    public CurrencyResponse() {}

    public CurrencyResponse(double value)
    {
        this.value = value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public double getValue()
    {
        return this.value;
    }

}
