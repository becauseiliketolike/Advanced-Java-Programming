// Q.1 Write a program to take two numbers as user input from console and display the sum.

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		System.out.print("The sum is: " + sum);
	}
}
