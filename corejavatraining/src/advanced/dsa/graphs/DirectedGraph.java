package advanced.dsa.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class DirectedGraph {
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
        }

//        for(int i=0;i<=n;i++){
//            for(int j=0;j<=n;j++){
//                System.out.print(graph[i][j]+" ");
//            }
//            System.out.println();
//        }
        bfs(n,graph);
        System.out.println();
        dfs(n,graph);
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
        }
//        for(ArrayList<Integer> l:graph){
//            System.out.println(l);
//        }
        bfs(n,graph);
        System.out.println();
        dfs(n,graph);
    }
    public static void bfs(int v, ArrayList<ArrayList<Integer>> graph){
        boolean[] visited = new boolean[v+1];
        for(int i=1;i<=v;i++) {
            if(!visited[i]) {
                Queue<Integer> q = new ArrayDeque<>();
                q.add(i);
                visited[i] = true;
                while (!q.isEmpty()) {
                    int s = q.poll();
                    System.out.print(s + " ");
                    for (int e : graph.get(s)) {
                        if (!visited[e]) {
                            q.add(e);
                            visited[e] = true;
                        }
                    }
                }
            }
        }
    }
    public static void bfs(int v, int[][] graph){
        boolean[] visited = new boolean[v+1];
        for(int i=1;i<=v;i++) {
            if(!visited[i]) {
                Queue<Integer> q = new ArrayDeque<>();
                q.add(i);
                visited[i] = true;
                while (!q.isEmpty()) {
                    int s = q.poll();
                    System.out.print(s + " ");
                    for (int j=0;j<graph.length;j++) {
                        if (graph[s][j]==1 && !visited[j]) {
                            q.add(j);
                            visited[j] = true;
                        }
                    }
                }
            }
        }
    }
    public static void dfs(int v, ArrayList<ArrayList<Integer>> graph){
        boolean visited[] = new boolean[v+1];
        for(int i=1;i<=v;i++){
            if(!visited[i]){
                dfs(i,graph,visited);
            }
        }
    }
    public static void dfs(int i, ArrayList<ArrayList<Integer>> graph, boolean[] visited){
        System.out.print(i+" ");
        visited[i]=true;
        for(int e: graph.get(i)){
            if(!visited[e]){
                dfs(e,graph,visited);
            }
        }
    }
    public static void dfs(int v, int[][] graph){
        boolean visited[] = new boolean[v+1];
        for(int i=1;i<=v;i++){
            if(!visited[i]){
                dfs(i,graph,visited);
            }
        }
    }
    public static void dfs(int i, int[][] graph, boolean[] visited){
        System.out.print(i+" ");
        visited[i]=true;
        for(int j=1;j<graph.length;j++){
            if(graph[i][j]==1 && !visited[j]){
                dfs(j,graph,visited);
            }
        }
    }
    public static void main(String[] args) {
        inputGraphM();
        //inputGraphL();
    }
}
