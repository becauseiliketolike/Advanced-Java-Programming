// Q.2 Create a program to take a line as input and write it to the file "Mydata.txt".

import java.io.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Mydata.txt");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your text: ");
            String text = sc.nextLine();
            fw.write(text);
            fw.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}