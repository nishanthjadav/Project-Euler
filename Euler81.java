package problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Euler81
{
    public static void main(String[] args)
    {

            int[][] matrix = new int[80][80];

            try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/nisha/Downloads/0081_matrix.txt"))) {
                String line;
                int row = 0;
                while ((line = br.readLine()) != null) {
                    String[] numbers = line.trim().split(",");
                    matrix[row] = new int[numbers.length];
                    for (int col = 0; col < numbers.length; col++) {
                        matrix[row][col] = Integer.parseInt(numbers[col]);
                    }
                    row++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
         // read from file
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Loop through the matrix
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                int up = Integer.MAX_VALUE;
                int left = Integer.MAX_VALUE;

                if (i > 0)
                {
                    up = matrix[i - 1][j];
                }

                if (j > 0)
                {
                    left = matrix[i][j - 1];
                }

                if (i != 0 || j != 0)
                {
                    matrix[i][j] += Math.min(up, left);
                }
            }
        }
        int answer = matrix[rows - 1][cols - 1];
        System.out.println("Minimum sum path moving down and right: " + answer);
    }
}
