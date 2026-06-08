package edu.cu.training.java.basics.Strings;

public class StringTokenizer {
    public static void main(String[] args) {
        String content="Java is, Amazing";
        java.util.StringTokenizer st = new java.util.StringTokenizer(content,",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
