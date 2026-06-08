package edu.cu.training.java.basics.CodingChallenge;

import java.util.Scanner;

public class subtract255 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                matrix[i][j] = sc.nextInt() - 255;
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
