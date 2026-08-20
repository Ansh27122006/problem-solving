package pauj.fileHandling;

import java.io.*;
import java.util.Scanner;

public class WriteDataWriter {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        String str = sc.nextLine();

        File f = new File("abc.txt");
        Writer w = new FileWriter(f);
        w.write(str);
        System.out.println("Data saved");
        w.close();
    }
}
