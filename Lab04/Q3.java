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
        System.out.println("| ID: " + this.id + "\t| Name: " + this.name + "\t| Grade: " + this.grade + " |");
    }
}

public class Q3 {
    public static void InputData(List<Student> studentList) {
        try {
            FileOutputStream fileOut = new FileOutputStream("Student.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(studentList);
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
            studentList = (List<Student>)objIn.readObject();
            objIn.close();
        } catch (Exception e) {
            System.out.println(e);
        } 
        return studentList;
    }

    public static void Display(List<Student> studentList, String msg) {
        System.out.println("---------------------");
        System.out.println(msg + " Student List");
        System.out.println("---------------------");
        for(Student student: studentList)
            student.Display();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> initialList = new ArrayList<Student>();  
        for(int i=0; i<3; i++) {
            System.out.print("Enter ID, Name and Grade for student " + (i+1) + ": ");
            int id = sc.nextInt();
            String name = sc.next();
            String grade = sc.next();
            initialList.add(new Student(id, name, grade));
        }
        InputData(initialList);
        List<Student> finalList = GetData();
        Collections.sort(finalList, Comparator.comparingInt(student -> student.id));
        Display(initialList, "Unsorted");
        Display(finalList, "Sorted");
    }
}