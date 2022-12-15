package com.example.xCodeSoftwareTask;

public class Numbers {
    private int[] numbers;
    private String order;
    
    Numbers()
    {
        this.numbers = null;
        this.order = "DESC";
    }

    Numbers(int[] numbers, String order)
    {
        this.numbers = numbers;
        this.order = order;
    }

    public void setNumbers(int[] numbers)
    {
        this.numbers = numbers;
    }

    public int[] getNumbers()
    {
        return this.numbers;
    }

    public void setOrder(String order)
    {
        this.order = order;;
    }

    public String getOrder()
    {
        return this.order;
    }

    public void quickSortInit() throws IllegalAccessException
    {
        quickSort(0, this.numbers.length - 1);
    }

    public void quickSort(int start, int end) throws IllegalAccessException
    {
        if(end == this.numbers.length) end--;
        if(start < 0 || end >= numbers.length)
        {
            throw new IllegalAccessException("Wrong range for quickSort");
        }
        if(this.order == "ASC")
        {
            if(start >= end) return;
            int frontier = start;
            for(int i = start; i < end; i++)
            {
                if(numbers[i] < numbers[end])
                {
                    int tmp = numbers[i];
                    numbers[i] = numbers[frontier];
                    numbers[frontier] = tmp;
                    frontier++;
                }
            }
            int tmp = numbers[end];
            numbers[end] = numbers[frontier];
            numbers[frontier] = tmp;

            quickSort(start, frontier - 1);
            quickSort(frontier + 1, end);
        }
        else
        {
            
            if(start >= end) return;
            int frontier = start;
            for(int i = start; i < end; i++)
            {
                if(numbers[i] > numbers[end])
                {
                    Integer tmp = numbers[i];
                    numbers[i] = numbers[frontier];
                    numbers[frontier] = tmp;
                    frontier++;
                }
            }
            int tmp = numbers[end];
            numbers[end] = numbers[frontier];
            numbers[frontier] = tmp;

            quickSort(start, frontier - 1);
            quickSort(frontier + 1, end);
        }
    }


}
