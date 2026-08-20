package pauj.fileHandling;

import java.io.*;
import java.util.Scanner;

public class WriteDataOutputStream {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        String str = sc.nextLine();

        File f = new File("abc.txt");
        OutputStream w = new FileOutputStream(f);
        byte[] arr = str.getBytes();
        w.write(arr);
        System.out.println("Data saved");
        w.close();
    }
}
