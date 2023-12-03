// Q.3 Write a program to create a class Student having attribute id, name, grade. 
// Take input of three users from console. Write those details to file. 
// Now, read all the user detail from file, sort the users and display the detail in console in sorted way.

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
        System.out.println("| ID: " + this.id + "\t| Name: " + this.name + "\t| Grade: " + this.grade + " |");
    }
}

public class Q3 {
    public static void InputData() {
        try {
            Scanner sc = new Scanner(System.in);
            FileOutputStream fileOut = new FileOutputStream("Student.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            for(int i=0; i<3; i++) {
                System.out.print("Enter ID, Name and Grade for student " + (i+1) + ": ");
                int id = sc.nextInt();
                String name = sc.next();
                String grade = sc.next();
                objOut.writeObject(new Student(id, name, grade));
            }
            objOut.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static List<Student> GetData() {
        List<Student> studentList = new ArrayList<Student>();
        try {
            FileInputStream fileIn = new FileInputStream("Student.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            while (fileIn.available() > 0) studentList.add((Student)objIn.readObject());
            objIn.close();
        } catch (Exception e) {
            System.out.println(e);
        } 
        return studentList;
    }
    
    public static void main(String[] args) {
        InputData();
        List<Student> studentList = GetData();
        Collections.sort(studentList, Comparator.comparing(student -> student.id));
        System.out.println("---------------------");
        System.out.println("Sorted Student List");
        System.out.println("---------------------");
        for(Student student: studentList)
            student.Display();
    }
}