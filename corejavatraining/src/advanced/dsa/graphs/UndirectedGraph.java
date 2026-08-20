package advanced.dsa.graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class UndirectedGraph {
    //inputting graph and storing it in 2D matrix
    public static void inputGraphM(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        int[][] graph = new int[n+1][n+1];
        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph[u][v]=1;
            graph[v][u]=1;
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
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for(ArrayList<Integer> l:graph){
            System.out.println(l);
        }
    }

    public static boolean isCyclic(ArrayList<ArrayList<Integer>> graph){
        return true;
    }

    public static void main(String[] args) {
        inputGraphM();
        inputGraphL();
    }
}
