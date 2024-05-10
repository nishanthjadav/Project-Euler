package problems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Euler79
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader read = new BufferedReader(new FileReader("C:\\users\\nisha\\downloads\\0079_keylog.txt"));
        String line;
        int i = 0;
        int[] nums = new int[50];
        while ((line = read.readLine()) != null)
        {
            int temp = Integer.parseInt(line);
            nums[i] = temp;
            i++;
        }

        TreeSet<Integer> filtered = new TreeSet<>();
        for (int x : nums)
        {
            filtered.add(x);
        }
        System.out.println(filtered);
      // [129, 160, 162, 168, 180, 289, 290, 316, 318, 319, 362, 368, 380, 389, 620, 629, 680, 689, 690, 710, 716, 718, 719, 720, 728, 729, 731, 736, 760, 762, 769, 790, 890]

    }

}
