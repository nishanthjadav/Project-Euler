package problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

public class Euler99
{
    public static void main(String[] args) {


        int[][] pairs = new int[1000][]; // Assuming 1000 pairs

        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/nisha/Downloads/pairs.txt"))) {
            String line;
            int row = 0;
            while ((line = br.readLine()) != null) {
                String[] numbers = line.trim().split(","); // Split using comma as delimiter
                pairs[row] = new int[numbers.length];
                for (int col = 0; col < numbers.length; col++) {
                    pairs[row][col] = Integer.parseInt(numbers[col].trim()); // Parse individual numbers
                }
                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }





            BigInteger largest = new BigInteger("0");
            int rowIndex = -1;
            for (int i = 0; i < pairs.length; i++)
            {

                BigInteger base = new BigInteger(String.valueOf(pairs[i][0]));
                BigInteger exponent = new BigInteger(String.valueOf(pairs[i][1]));
                int exp = exponent.intValue();
                BigInteger answer = base.pow(exp);
                if (answer.compareTo(largest) > 0)
                {
                    largest = answer;
                    rowIndex = i;
                }
                answer = BigInteger.valueOf(0);
                System.out.println("Currently on row: " + i);
            }
        System.out.println("largest value is: " + largest);
        System.out.println("found at row: " + rowIndex); // dis jawn off by 1





    }
}
