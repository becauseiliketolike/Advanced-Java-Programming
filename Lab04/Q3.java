// Q.3 Write a program to create a class Student having attribute id, name, grade. Take input of three users from console. Write those details to file. Now, read all the user detail from file, sort the users and display the detail in console in sorted way.

import java.io.*;
import java.util.*;

class Student implements Serializable {
    public int id;
    public String name, grade;

    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void Display() {
        System.out.println("| ID: " + this.id + " | Name: " + this.name + " | Grade: " + this.grade + " |");
    }
}

public class Q3 {
    public static void InputData() {
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fileOut = new FileOutputStream("Student.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            for(int i=0; i<3; i++) {
                System.out.print("Enter ID, Name and Grade for " + (i+1) + " student: ");
                int id = sc.nextInt();
                String name = sc.next();
                String grade = sc.next();
                Student s = new Student(id, name, grade);
                objOut.writeObject(s);
            }
            objOut.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static List<Student> GetData() {
        List<Student> studentList = new ArrayList<Student>();  
        try {
            FileInputStream fileIn = new FileInputStream("Student.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            for(int i=0; i<3; i++) {
                Student s = (Student)objIn.readObject();
                studentList.add(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return studentList;
        }
    }

    public static void main(String[] args) {
        InputData();
        List<Student> studentList = GetData();
        for (Student s: studentList) {
            if (s.id > )
        }
    }
}