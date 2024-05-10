package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Euler59
{
    public static String decode(String cipher, String key)
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < cipher.length(); i++)
        {
            int decodedChar = cipher.charAt(i) ^ key.charAt(i % key.length());
            result.append((char) decodedChar);
        }
        return result.toString();
    }

    public static boolean containsCommonEnglishWords(String text)
    {

        String[] commonWords = {"the", "and", "you", "for", "not", "are", "but", "can", "have"};
        int count = 0;
        for (String word : commonWords)
        {
            if (text.contains(word))
            {
                count++;
            }
        }
        return count > 4; // arbitrary val to check how much sense the output makes
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("C:\\Users\\nisha\\Downloads\\0059_cipher.txt"));
        String cipher = "";
        while (sc.hasNext())
        {
            String line = sc.nextLine();
            String[] numbers = line.split(",");
            for (String s : numbers)
            {
                cipher += (char) Integer.parseInt(s);
            }
        }
        for (char i = 'a'; i <= 'z'; i++)
        {
            for (char j = 'a'; j <= 'z'; j++)
            {
                for (char k = 'a'; k <= 'z'; k++)
                {
                    String key = "" + i + j + k;
                    String decodedText = decode(cipher, key);

                    if (containsCommonEnglishWords(decodedText))
                    {
                        int sum = 0;
                        for (char c : decodedText.toCharArray())
                        {
                            sum += c;
                        }
                        System.out.println("Decoded Text: " + decodedText);
                        System.out.println("Sum of ASCII values: " + sum);
                        return;
                    }
                }
            }
        }
    }
}
