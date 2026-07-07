package problems;
import static problems.MyFunctions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Euler107 {
    static int V = 40;
    static int[] parent = new int[V];
    static int INF = Integer.MAX_VALUE;

    public static int find(int i)
    {
        while (parent[i] != i)
        {
            i = parent[i];
        }
        return i;
    }
    public static void union1(int i, int j)
    {
        int a = find(i);
        int b = find(j);
        parent[a] = b;
    }
    public static int kruskalMST(int cost[][])
    {
        int mincost = 0; 

        for (int i = 0; i < V; i++)
        {
            parent[i] = i;
        }

        int edge_count = 0;
        while (edge_count < V - 1)
        {
            int min = INF, a = -1, b = -1;
            for (int i = 0; i < V; i++)
            {
                for (int j = 0; j < V; j++) 
                {
                    if (find(i) != find(j) && cost[i][j] < min) 
                    {
                        min = cost[i][j];
                        a = i;
                        b = j;
                    }
                }
            }

            union1(a, b);
            edge_count++;
            mincost += min;
        }
        return mincost;
    }

    public static int weight(int[][] graph)
    {
        int sum = 0;
        for(int i = 0; i < graph.length; i++)
        {
            for(int j = 0; j < graph[i].length; j++)
            {
                if(graph[i][j] == INF)
                {
                    sum += 0;
                } else{
                    sum += graph[i][j];
                }
            }
        }
        return sum / 2;
    }
    public static int maxSaving(int[][] graph)
    {
        return weight(graph) - kruskalMST(graph);
    }

    public static void main(String[] args) {

       
            int[][] matrix = new int[40][40];

            try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/I774290/Downloads/0107_network.txt"))) {
                String line;
                int row = 0;
                while ((line = br.readLine()) != null) {
                    String[] numbers = line.trim().split(",");
                    for(int col = 0; col < numbers.length; col++)
                    {
                        String value = numbers[col].trim();
                        if(value.equals("-"))
                        {
                            matrix[row][col] = INF;
                        } else{
                            matrix[row][col] = Integer.parseInt(value);
                        }
                    }
                    row++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        System.out.println(maxSaving(matrix));
    }
}
