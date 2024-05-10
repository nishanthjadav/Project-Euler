package problems;

import java.util.ArrayList;
import java.util.Collections;

public class Euler24
{
    static ArrayList<String> numList = new ArrayList<>();
    public static void printPermutations(long num)
    {
        String numString = String.valueOf(num);
        int length = numString.length();
        boolean[] used = new boolean[length];
        StringBuilder result = new StringBuilder();
        backtrack(numString, length, used, result);

        Collections.sort(numList);
        System.out.println(numList.get(999999));
        //System.out.println(numList);

    }
    public static void backtrack(String num, int length, boolean[] used, StringBuilder result)
    {
        if (result.length() == length)
        {
            //System.out.println(result);
            numList.add(result.toString());
            return;
        }

        for (int i = 0;  i < length; i++)
        {
            if (!used[i])
            {
                used[i] = true;
                result.append(num.charAt(i));
                backtrack(num, length, used, result);
                used[i] = false;
                result.setLength(result.length() - 1);
            }
        }


    }
    public static void main(String[] args)
    {
        printPermutations(9876543210L);


    }
}
