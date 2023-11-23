// Q.2 Write a program to show the use of package. Compile and run from command line.

import tools.Calc;

public class Q2 {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println("Package tools.Calc: Sum = " + c.sum(5, 4));
    }
}