package problems;

import java.math.BigInteger;
import java.util.*;
public class Euler078
{
    public static void main(String[] args) {
         // just guess n using same DP from Euler076.java
        int n = 55374;

        ArrayList<BigInteger> ways = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            ways.add(BigInteger.ZERO);
        }

        ways.set(0, BigInteger.ONE);

        for (int i = 1; i < n; i++) {
            if(i % 1000 == 0) System.out.println(i);
            for (int j = i; j <= n; j++) {
                ways.set(j, ways.get(j).add(ways.get(j - i)));
            }
        }
        System.out.println(ways.get(n).add(BigInteger.ONE));

        if(ways.get(n).add(BigInteger.ONE).mod(BigInteger.valueOf(1_000_000)).equals(BigInteger.ZERO))
        {
            System.out.println("true");
        }
    }
}
