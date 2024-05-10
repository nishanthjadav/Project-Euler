package problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Euler67
{
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        int[][] triangle = new int[100][];

        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/nisha/Downloads/triangle.txt")))
        {
            String line;
            int row = 0;
            while ((line = br.readLine()) != null)
            {
                String[] numbers = line.trim().split("\\s+");
                triangle[row] = new int[numbers.length];
                for (int col = 0; col < numbers.length; col++)
                {
                    triangle[row][col] = Integer.parseInt(numbers[col]);
                }
                row++;
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        //LINES 11-30 ARE SOLELY TO TURN THE FILE INTO A 2D ARRAY

        int rows = triangle.length;


        for (int i = rows - 2; i >= 0; i--)
        {
            for (int j = 0; j <= i; j++)
            {

                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }

        int maxSum = triangle[0][0]; // bottom up approach results in max being at top of triangle
        System.out.println("Maximum sum path: " + maxSum);
        long end = System.nanoTime();
        System.out.println((end - start) / Math.pow(10, 6));



    }
}
