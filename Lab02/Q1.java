// Q.1 Create a class Student that has three properties id, name and address. 
// Ask user to input those data from the console, initialize the object and print the details as:

// Name: NGT God
// Address: Universe
// Id: 001

import java.util.Scanner;

class Student {
    private String id, name, address;

    public Student(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void Display() {
        System.out.println("----------------");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Id: " + this.id);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id: ");
        String id = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        Student student = new Student(id, name, address);
        student.Display();
    }
}