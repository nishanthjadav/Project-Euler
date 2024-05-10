package problems;

import java.util.HashSet;

public class Euler32 {
    public static boolean isPandigital(String s)
    {
//        String numString = String.valueOf(n);
//        int length = numString.length();
//        boolean[] digits = new boolean[length + 1];
//
//        for (int i = 0; i < length; i++)
//        {
//            char currentChar = numString.charAt(i);
//
//            if (currentChar == '0' || currentChar > (char) ('0' + length) || digits[currentChar - '0'])
//            {
//                return false;
//            }
//            digits[currentChar - '0'] = true;
//        }
//
//        for (int i = 1; i <= length; i++)
//        {
//            if (!digits[i]) {
//                return false;
//            }
//        }
//
//        return true;
        if (s.length() != 9)
        {
            return false;
        }
        for (char c = '1'; c <= '9'; c++)
        {
            if (s.indexOf(c) == -1)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        HashSet<Integer> productList = new HashSet<>();
        int product = 1;
        long threeTermIdentity = 0;


            for (int i = 1; i < 2000; i++)
            {
                for (int j = 1; j < 2000; j++)
                {
                    product = i * j;
                    String concat = Integer.toString(i) + Integer.toString(j) + Integer.toString(product);


                    if (isPandigital(concat))
                    {
                        System.out.println(concat + " product: " + product);
                        productList.add(product);
                    }
                }
            }



        int sum = 0;
        for (int i : productList)
        {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
