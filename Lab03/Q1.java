// Q.1 Write a program to take a line as input. Check if the words are palindrome. If yes write to file "palindrome.txt" otherwise write to file "NotPalindrome.txt".

import java.io.*;
import java.util.Scanner;

class Word {
    public String text;
    public void Get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = sc.nextLine().toLowerCase();
    }
    public boolean Check() {
        String revText = "";
        for (int i=0; i < this.text.length(); i++)
            revText = this.text.charAt(i) + revText;
        return text.equals(revText);
    }
    public void Write(String filename) {
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write(this.text);
            fw.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Word word = new Word();
        word.Get();
        if(word.Check()) 
            word.Write("Palindrome.txt");
        else
            word.Write("NotPalindrome.txt");
    }
}