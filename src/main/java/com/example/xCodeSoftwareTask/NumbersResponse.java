package com.example.xCodeSoftwareTask;

public class NumbersResponse {
    private int[] numbers;
    
    public NumbersResponse()
    {
        this.numbers = null;
    }

    public NumbersResponse(int[] numbers)
    {
        this.numbers = numbers;
    }

    public void setNumbers(int[] numbers)
    {
        this.numbers = numbers;
    }

    public int[] getNumbers()
    {
        return this.numbers;
    }
}
