package org.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Factorial
{
    public List<BigInteger> getFirstNFactorials(int n)
    {
        if (n <= 0)
        {
            throw new IllegalArgumentException("invalid n");
        }
        List<BigInteger> factorials = new ArrayList<>(n);
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            factorials.add(factorial);
        }
        return factorials;
    }
}