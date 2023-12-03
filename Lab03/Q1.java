// Q.1 Write a program to take a line as input. Check if the words are palindrome. 
// If yes write to file "palindrome.txt" otherwise write to file "NotPalindrome.txt".

// Test input: wow jkl tenet hamro stats ramro radar good noon mood mom should madam 

import java.io.*;
import java.util.Scanner;

class Word {
    public String[] text;

    public void Get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = sc.nextLine().toLowerCase().split(" ");
    }

    public boolean Check(String t) {
        String revText = "";
        for (int i=0; i < t.length(); i++)
            revText = t.charAt(i) + revText;
        return t.equals(revText);
    }

    public void Write(String filename, String t) {
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(t + " ");
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
        for (String t : word.text) {
            if(word.Check(t))
                word.Write("Palindrome.txt", t);
            else
                word.Write("NotPalindrome.txt", t);
        }
    }
}