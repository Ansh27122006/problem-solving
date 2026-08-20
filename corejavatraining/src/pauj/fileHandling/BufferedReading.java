package pauj.fileHandling;

import java.io.*;
import java.util.Scanner;

public class BufferedReading {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name:");
        String str = sc.nextLine();

//        File f = new File(str);
        Reader r = new FileReader(str);
        BufferedReader br = new BufferedReader(r);

        //reading character by character
        int data = br.read();
        while(data!=-1) {
            System.out.print((char) data);
            data = br.read();
        }

        //reading line by line
        String line = br.readLine();
        while(line!=null){
            line = br.readLine();
        }
        br.close();
    }
}
