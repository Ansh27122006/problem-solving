package edu.cu.training.java.basics.practice;

public class RatInMaze {
    static int ways(int[][] maze, int n){
        return countWays(0,0,n,maze);
    }
    static int countWays(int r, int c, int n, int[][] maze){
        if(r>=n || c>=n){
            return 0;
        }else if(r==n-1 &&  c==n-1){
            return 1;
        }else if(maze[r][c]==-1){
            return 0;
        }

        return countWays(r+1,c,n,maze)+countWays(r,c+1,n,maze);
    }
    public static void main(String[] args) {
        int[][] maze={{0,-1,-1,-1},{0,0,-1,-1},{-1,0,0,-1},{-1,0,0,0}};
        System.out.println(ways(maze,4));
    }
}
