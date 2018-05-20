package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        BigInteger i ;
        for (i= BigInteger.valueOf(11); i.compareTo(new BigInteger("1000000000")) < 0;i=i.add(BigInteger.ONE))
        {
            if (isNumberRotatorImproved(i)) {
                System.out.println(i);
                //sum += i;
            }
        }
        for (int j = 9; j<=99;j++)
            sum += 55555 + 4 * 111110;

        System.out.println(sum);
    }

    public static boolean isNumberRotator(int n)
    {
        int lastdigit = n % 10;
        int number = n / 10;
        int lg = (int)Math.floor(Math.log10(n));
        var new_number = number + lastdigit* Math.pow(10,lg);
        if (new_number % n == 0)
            return  true;

        return false;
    }

    public static boolean isNumberRotatorImproved(BigInteger n)
    {
        String s = String.valueOf(n);
        s = s.substring(s.length() - 1) + s.substring(0,s.length() - 1);
        BigInteger o = new BigInteger(s);

        var a = o.mod(n);
        var cnd = a.compareTo(BigInteger.ZERO);
        if (cnd == 0)
            return  true;

        return false;
    }
}
