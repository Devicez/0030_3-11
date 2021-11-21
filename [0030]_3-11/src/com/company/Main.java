//package com.company;

import java.math.BigInteger;
import java.util.Scanner;

class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BigInteger price = input.nextBigInteger();

        BigInteger mod3 = price.mod(BigInteger.valueOf(3));
        BigInteger mod11 = price.mod(BigInteger.valueOf(11));

        System.out.println(mod3 + " " + mod11);
    }
}
