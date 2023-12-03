// Q.3 Create a custom exception UnAuthorizedException. Write a program to take role as 
// user input and throw the exception if the input user role is not Employee.

import java.io.*;
import java.util.Scanner;

class UnAuthorizedException extends Exception {
    public UnAuthorizedException(String error) {
        super(error);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your role: ");
        String role = sc.nextLine().toLowerCase();
        try {
            if (!role.equals("employee")) {
                throw new UnAuthorizedException(role + " is not authorized");
            } else {
                System.out.println("User authorized");    
            }
        } catch (UnAuthorizedException e) {
            System.out.println(e);
        }
    }
}