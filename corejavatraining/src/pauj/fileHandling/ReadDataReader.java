package pauj.fileHandling;

import java.io.*;
import java.util.Scanner;

public class ReadDataReader {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name:");
        String str = sc.nextLine();

//        File f = new File(str);
        Reader r = new FileReader(str);
        int data = r.read();

        while(data!=-1){
            System.out.print((char)data);
            data=r.read();
        }
        r.close();
    }
}
