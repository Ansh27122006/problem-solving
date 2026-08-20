package advanced.dsa.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WeightedGraph {
    //inputting graph and storing it in 2D matrix
    public static void inputGraphM(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        int[][] graph = new int[n+1][n+1];
        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            graph[u][v]=w;
            graph[v][u]=w;
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
    //inputting graph and storing it in list
    public static void inputGraphL(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<HashMap<Integer,Integer>> graph= new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new HashMap<Integer,Integer>());
        }
        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            graph.get(u).put(v,w);
            graph.get(v).put(u,w);
        }
        for(HashMap<Integer,Integer> l:graph){
            System.out.println(l);
        }
    }
    public static void main(String[] args) {
        inputGraphM();
        inputGraphL();
    }
}
