package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for (int i = 11;i<Math.pow(10,10);i++)
        {
            if (isNumberRotator(i))
                System.out.println(i);
        }
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
}
