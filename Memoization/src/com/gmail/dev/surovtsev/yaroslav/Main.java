package com.gmail.dev.surovtsev.yaroslav;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<Integer, BigInteger> map = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Integer n = 5;
            long start = System.currentTimeMillis();
            BigInteger fact = factorial(n);
            System.out.println("" + n + "! = " + fact.toString());
            System.out.println(System.currentTimeMillis() - start + " ms");
            System.out.println("test merge commit2");
        }
    }

    public static BigInteger factorial(Integer number) {
        BigInteger result = map.get(number);
        if (result == null) {
            result = BigInteger.ONE;
            for (int i = 1; i <= number; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
        }
        return result;
    }
}
