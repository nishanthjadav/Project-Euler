package problems;

import java.io.*;
import java.util.ArrayList;

public class Euler102
{
    public static ArrayList<Integer> stringToArrayList (String s)
    {
        ArrayList<Integer> triangle = new ArrayList<>();

        String[] integerStrings = s.split(",");

        for (String intStr : integerStrings)
        {
            int val = Integer.parseInt(intStr);
            triangle.add(val);
        }
        return triangle;
    }
   /* public static ArrayList<Integer> filteredList (ArrayList<Integer> unfiltered) // generic filters
    {
        ArrayList<Integer> filtered = new ArrayList<>();
       for (int i = 0; i <= 5; i++)
       {
           if (unfiltered.get(0) < 0 && unfiltered.get(2) < 0 && unfiltered.get(4) < 0) // all x < 0
           {
               return null;
           }
           else if (unfiltered.get(0) > 0 && unfiltered.get(2) > 0 && unfiltered.get(4) > 0) // all x > 0
           {
               return null;
           }
           else if (unfiltered.get(1) < 0 && unfiltered.get(3) < 0 && unfiltered.get(4) < 0) // all y < 0
           {
               return null;
           }
           else if (unfiltered.get(1) > 0 && unfiltered.get(3) > 0 && unfiltered.get(4) > 0) // all y > 0
           {
               return null;
           }
           else{
               filtered.add(unfiltered.get(i));
           }
       }
       return filtered;

    }
    public static boolean haveDiffSigns(int x, int y)
    {
        if (x > 0 && y < 0)
        {
            return true;
        }
        else if (x < 0 && y > 0)
        {
            return true;
        } else {
            return false;
        }
    }*/
    public static boolean containsOrigin(ArrayList<Integer> x) // -> in the filtered form [x1, y1, x2, y2, x3, y3]
    {
        if (x == null)
        {
            return false;
        }
        // Slopes:
            float m1 = (float) (x.get(3) - x.get(1)) / (x.get(2) - x.get(0)); // slope of 1st and 2nd points
            float m2 = (float) (x.get(5) - x.get(1)) / (x.get(4) - x.get(0)); // slope of 1st and 3rd points
            float m3 = (float) (x.get(3) - x.get(5)) / (x.get(2) - x.get(4)); // slope of 2nd and 3rd points
        // Y-intercepts
            float b1 = x.get(1) - m1*x.get(0);
            float b2 = x.get(1) - m2*x.get(0);
            float b3 = x.get(5) - m3*x.get(4);

        // y < or > m1(x) + b1\
            // if true than > if false then <
            boolean bool1 = (m1*x.get(4)+b1) < x.get(5); // if 3rd point is above line segment of point 1 and 2 then value is true
            boolean bool2 = (m2*x.get(2)+b2) < x.get(3);
            boolean bool3 = (m3*x.get(0)+b3) < x.get(1);

            //boolean containsOrigin = true;
            return (bool1 ? (0 > b1):(0 < b1)) && (bool2 ? (0 > b2):(0 < b2)) && (bool3 ? (0 > b3):(0 < b3));

        //return containsOrigin;

        // for at least two of the points, x and y have to have different signs (generic filter)
/*
        if (haveDiffSigns(x.get(0), x.get(1)) && haveDiffSigns(x.get(2), x.get(3))) // x1y1 && x2y2
        {
            return true;
        }
        else if (haveDiffSigns(x.get(0), x.get(1)) && haveDiffSigns(x.get(4), x.get(5))) // x1y1 && x3y3
        {
            return true;
        }
        else if (haveDiffSigns(x.get(2), x.get(3)) && haveDiffSigns(x.get(4), x.get(5))) // x2y2 && x3y3
        {
            return true;
        }
        else if (haveDiffSigns(x.get(0), x.get(1)) && haveDiffSigns(x.get(2), x.get(3)) && haveDiffSigns(x.get(4), x.get(5))) // x1y2 && x2y2 && x3y3
        {
            return true;
        } else {
            return false;
        }

    */


    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\nisha\\downloads\\0102_triangles.txt"));
        String line;
        int count = 0;
        while ((line = reader.readLine()) != null)
        {
            if (containsOrigin(stringToArrayList(line)))
            {
                System.out.println((stringToArrayList(line)));
                count++;
            }
        }

       System.out.println(count);
    }
}
