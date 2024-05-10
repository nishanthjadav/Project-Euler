package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Euler54
{
    public static String alistToStirng(ArrayList<Character> whatever)
    {
        StringBuilder hjk = new StringBuilder();
        for (char i : whatever)
        {
            hjk.append(i);
        }
        return String.valueOf(hjk);
    }
    public static double highCard(String hand)
    {
        HashMap<Character, Integer> cardVals = new HashMap<>();
        cardVals.put('A', 14);
        cardVals.put('K', 13);
        cardVals.put('Q', 12);
        cardVals.put('J', 11);
        cardVals.put('T', 10);


        int highest = 0;
        for (int i = 0; i < hand.length(); i+=3)
        {
            if (cardVals.containsKey(hand.charAt(i)))
            {
                if (cardVals.get(hand.charAt(i)) > highest)
                {
                    highest = cardVals.get(hand.charAt(i));
                }
            }
            else if (hand.charAt(i) - '0' > highest)
            {
                highest = hand.charAt(i) - '0';
            }
        }
        return 1 + highest/15.0;
    }
    public static double onePair(String s)
    {
        ArrayList<Character> CharArr = new ArrayList<>();
        s = s.replaceAll(" ", "");
        HashMap<Character, Integer> cardVals = new HashMap<>();
        cardVals.put('A', 14);
        cardVals.put('K', 13);
        cardVals.put('Q', 12);
        cardVals.put('J', 11);
        cardVals.put('T', 10);
        cardVals.put('9', 9);
        cardVals.put('8', 8);
        cardVals.put('7', 7);
        cardVals.put('6', 6);
        cardVals.put('5', 5);
        cardVals.put('4', 4);
        cardVals.put('3', 3);
        cardVals.put('2', 2);
        for (char c : s.toCharArray())
        {
            CharArr.add(c);
        }
        for(int i = 0; i < s.length();i+=2)
        {
            if(Collections.frequency(CharArr, s.charAt(i)) >= 2)
            {
                return 2 + (cardVals.get(s.charAt(i)))/15.0;
            }
        }
        return -1;
    }
    public static double twoPair(String s)
    {
        ArrayList<Character> CharArr = new ArrayList<>();
        s = s.replaceAll(" ", "");
        HashMap<Character, Integer> cardVals = new HashMap<>();
        cardVals.put('A', 14);
        cardVals.put('K', 13);
        cardVals.put('Q', 12);
        cardVals.put('J', 11);
        cardVals.put('T', 10);
        cardVals.put('9', 9);
        cardVals.put('8', 8);
        cardVals.put('7', 7);
        cardVals.put('6', 6);
        cardVals.put('5', 5);
        cardVals.put('4', 4);
        cardVals.put('3', 3);
        cardVals.put('2', 2);
        for (char c : s.toCharArray())
        {
            CharArr.add(c);
        }
        for(int i = 0; i < s.length();i+=2)
        {
            if(Collections.frequency(CharArr, s.charAt(i)) >= 2)
            {
                ArrayList<Character> CharArr1 = new ArrayList<>();
                char c = s.charAt(i);
                for(int j = 0; j < s.length();j+=2)
                {
                    if(s.charAt(j) !=c)
                    {
                        CharArr1.add(s.charAt(j));
                        CharArr1.add(s.charAt(j+1));
                    }
                }
                if (onePair(alistToStirng(CharArr1)) != -1)
                {
                    return 3 + Math.max(onePair(alistToStirng(CharArr1)), onePair(alistToStirng(CharArr))) - 2;
                }
            }
        }
        return -1;
    }
    public static double threeKind(String s)
    {
        ArrayList<Character> CharArr = new ArrayList<>();
        s = s.replaceAll(" ", "");
        HashMap<Character, Integer> cardVals = new HashMap<>();
        cardVals.put('A', 14);
        cardVals.put('K', 13);
        cardVals.put('Q', 12);
        cardVals.put('J', 11);
        cardVals.put('T', 10);
        cardVals.put('9', 9);
        cardVals.put('8', 8);
        cardVals.put('7', 7);
        cardVals.put('6', 6);
        cardVals.put('5', 5);
        cardVals.put('4', 4);
        cardVals.put('3', 3);
        cardVals.put('2', 2);

        for (char c : s.toCharArray())
        {
            CharArr.add(c);
        }
        for(int i = 0; i < s.length();i+=2)
        {
            if(Collections.frequency(CharArr, s.charAt(i)) >= 3)
            {
                return 4 + (cardVals.get(s.charAt(i)))/15.0;
            }
        }
        return -1;
    }
    public static double straight(String s)
    {
        HashMap<Character, Integer> cardVals = new HashMap<>();
        cardVals.put('A', 14);
        cardVals.put('K', 13);
        cardVals.put('Q', 12);
        cardVals.put('J', 11);
        cardVals.put('T', 10);

        int highest = 0;
        ArrayList<Integer> vals = new ArrayList<>();
        for (int i = 0; i < s.length(); i+=3)
        {
            if (cardVals.containsKey(s.charAt(i)))
            {
                if (cardVals.get(s.charAt(i)) > highest)
                {
                    highest = cardVals.get(s.charAt(i));
                }
            }
            else if (s.charAt(i) - '0' > highest)
            {
                highest = s.charAt(i) - '0';
            }
            if (cardVals.containsKey(s.charAt(i)))
            {
                vals.add(cardVals.get(s.charAt(i)));
            }
            else{
                vals.add( s.charAt(i) - '0');
            }
        }
        int realHigh = highest;
        if (highest == 14 && vals.contains(2))
        {
            highest = 1;
            for (int i = 0; i < 4; i++)
            {
                if (!vals.contains(highest + 1))
                {
                    return -1;
                }
                else{
                    highest += 1;
                }
            }
            return 5 + realHigh/15.0;
        }
        for (int i = 0; i < 4; i++)
        {
            if (!vals.contains(highest - 1))
            {
                return -1;
            }
            else{
                highest -= 1;
            }
        }

        return 5 + realHigh/15.0;
    }
    public static double flush(String s)
    {
        ArrayList<Character> CharArr = new ArrayList<>();
        s = s.replaceAll(" ", "");
        HashMap<Character, Integer> cardVals = new HashMap<>();
        cardVals.put('A', 14);
        cardVals.put('K', 13);
        cardVals.put('Q', 12);
        cardVals.put('J', 11);
        cardVals.put('T', 10);
        cardVals.put('9', 9);
        cardVals.put('8', 8);
        cardVals.put('7', 7);
        cardVals.put('6', 6);
        cardVals.put('5', 5);
        cardVals.put('4', 4);
        cardVals.put('3', 3);
        cardVals.put('2', 2);
        for (char c : s.toCharArray())
        {
            CharArr.add(c);
        }
        for(int i = 1; i < s.length();i+=2)
        {
            if(Collections.frequency(CharArr, s.charAt(i)) >= 5)
            {
                return 6 + highCard(s) - 1;
            }
        }
        return -1;
    }
    public static double fullHouse(String s)
    {
        ArrayList<Character> CharArr = new ArrayList<>();
        s = s.replaceAll(" ", "");

        for (char c : s.toCharArray())
        {
            CharArr.add(c);
        }
        for(int i = 0; i < s.length();i+=2)
        {
            if(Collections.frequency(CharArr, s.charAt(i)) >= 3)
            {
                CharArr.remove(CharArr.indexOf(s.charAt(i)) + 1);
                CharArr.remove(CharArr.indexOf(s.charAt(i)));
                CharArr.remove(CharArr.indexOf(s.charAt(i)) + 1);
                CharArr.remove(CharArr.indexOf(s.charAt(i)));
                CharArr.remove(CharArr.indexOf(s.charAt(i)) + 1);
                CharArr.remove(CharArr.indexOf(s.charAt(i)));
                if(alistToStirng(CharArr).charAt(0) == alistToStirng(CharArr).charAt(2))
                {
                    return 7 + s.charAt(i)/15.0;
                }
            }
        }
        return -1;
    }
    public static double fourKind(String s)
    {
        ArrayList<Character> CharArr = new ArrayList<>();
        s = s.replaceAll(" ", "");
        HashMap<Character, Integer> cardVals = new HashMap<>();
        cardVals.put('A', 14);
        cardVals.put('K', 13);
        cardVals.put('Q', 12);
        cardVals.put('J', 11);
        cardVals.put('T', 10);
        cardVals.put('9', 9);
        cardVals.put('8', 8);
        cardVals.put('7', 7);
        cardVals.put('6', 6);
        cardVals.put('5', 5);
        cardVals.put('4', 4);
        cardVals.put('3', 3);
        cardVals.put('2', 2);
        for (char c : s.toCharArray())
        {
            CharArr.add(c);
        }
        for(int i = 0; i < s.length();i+=2)
        {
            if(Collections.frequency(CharArr, s.charAt(i)) >= 4)
            {
                return 8 + (cardVals.get(s.charAt(i)))/15.0;
            }
        }
        return -1;
    }

    public static double straightFlush(String s)
    {
        return (straight(s)!=-1 && flush(s)!=-1) ? 9 + straight(s) - 5 : -1;
    }
    public static double royalFlush(String s)
    {
        return ((straight(s) != -1) && (flush(s) != -1) && s.contains("A") && s.contains("K"))?10:-1;
    }

    public static double gethowgoodhandis(String hand)
    {
        double handRank = 0;
        handRank = Math.max(handRank,highCard(hand));
        handRank = Math.max(handRank,onePair(hand));
        handRank = Math.max(handRank,twoPair(hand));
        handRank = Math.max(handRank,threeKind(hand));
        handRank = Math.max(handRank,straight(hand));
        handRank = Math.max(handRank,flush(hand));
        handRank = Math.max(handRank,fullHouse(hand));
        handRank = Math.max(handRank,fourKind(hand));
        handRank = Math.max(handRank,straightFlush(hand));
        handRank = Math.max(handRank,royalFlush(hand));
        return handRank;
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("C:\\Users\\nisha\\Downloads\\0054_poker.txt"));
        int count1 = 0;
        while (sc.hasNext())
        {
            String s = sc.nextLine();
            String player1 = s.substring(0, 15);
            String player2 = s.substring(15, 29);
            if (gethowgoodhandis(player1) > gethowgoodhandis(player2))
            {
                count1++;
                System.out.println("P1(" + gethowgoodhandis(player1) + "): " + player1 + "        " + "P2(" + gethowgoodhandis(player2) + "): " + player2);
            }
        }
        System.out.println(count1);

       // TH 8H 5C QS TC

    }
}
