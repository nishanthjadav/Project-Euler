package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Euler068 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> seen = new ArrayList<>();
        for(int sum = 14; sum <= 19; sum++)
        {
            for(int i = 1; i <= 10; i++)
            {
                for(int j = 1; j <= 10; j++)
                {
                    for(int k = 1; k <= 10; k++)
                    {
                        ArrayList<Integer> curr = new ArrayList<>();
                        if(i != j && j != k && i != k && i + j + k == sum)
                        {
                            curr.add(i);
                            curr.add(j);
                            curr.add(k);
                            seen.add(curr);
                        }
                    }
                }
            }
        }

        for(ArrayList<Integer> a : seen)
        {
            for(ArrayList<Integer> b : seen)
            {
                for(ArrayList<Integer> c : seen)
                {
                    for(ArrayList<Integer> d : seen)
                    {
                        for(ArrayList<Integer> e : seen)
                        {
                            if(     a.get(2).equals(b.get(1)) && a.get(1).equals(e.get(2)) &&
                                    b.get(2).equals(c.get(1)) && c.get(2).equals(d.get(1)) && d.get(2).equals(e.get(1)) &&
                                    !a.get(0).equals(b.get(0)) && !a.get(0).equals(c.get(0)) && !a.get(0).equals(d.get(0)) && !a.get(0).equals(e.get(0)) &&
                                    !b.get(0).equals(a.get(0)) && !b.get(0).equals(c.get(0)) && !b.get(0).equals(d.get(0)) && !b.get(0).equals(e.get(0)) &&
                                    !c.get(0).equals(a.get(0)) && !c.get(0).equals(b.get(0)) && !c.get(0).equals(d.get(0)) && !c.get(0).equals(e.get(0)) &&
                                    !d.get(0).equals(a.get(0)) && !d.get(0).equals(b.get(0)) && !d.get(0).equals(c.get(0)) && !d.get(0).equals(e.get(0)) &&
                                    !e.get(0).equals(a.get(0)) && !e.get(0).equals(b.get(0)) && !e.get(0).equals(c.get(0)) && !e.get(0).equals(d.get(0))
                            ){
                                Set<Integer> set = new HashSet<>();
                                set.addAll(a);
                                set.addAll(b);
                                set.addAll(c);
                                set.addAll(d);
                                set.addAll(e);
                                if(set.size() == 10)
                                {
                                    StringBuilder res = new StringBuilder();
                                    for(int x : a)
                                    {
                                        res.append(x);
                                    }
                                    for(int x : b)
                                    {
                                        res.append(x);
                                    }
                                    for(int x : c)
                                    {
                                        res.append(x);
                                    }
                                    for(int x : d)
                                    {
                                        res.append(x);
                                    }
                                    for(int x : e)
                                    {
                                        res.append(x);
                                    }
                                    if(res.length() == 16)
                                    {
                                        System.out.println(a + " | " + b + " | " + c + " | " + d + " | " + e + ": " + res);
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

