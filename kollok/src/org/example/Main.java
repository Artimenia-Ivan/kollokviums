package org.example;

import java.math.BigInteger;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        org.example.Factorial calculator = new org.example.Factorial();
        int n = 10;
        List<BigInteger> factorials = calculator.getFirstNFactorials(n);
        System.out.println("to "+ n);
        int count = 0;
        for (BigInteger factorial : factorials)
        {
            count+=1;
            System.out.println(count+ ":" + factorial);
        }
    }
}