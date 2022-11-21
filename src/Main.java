import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    long admissionNumber;
    int rollNumber;
    String college;

    public Student(String name, long admissionNumber, int rollNumber, String college) {
        this.name = name;
        this.admissionNumber = admissionNumber;
        this.rollNumber = rollNumber;
        this.college = college;
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> studentList = new ArrayList<Student>();
    static void addStudent() {
        System.out.print("Enter Student name:");
        String name = sc.next();
        System.out.print("Enter admission number:");
        long admissionNumber = sc.nextLong();
        System.out.print("Enter roll number:");
        int rollNumber = sc.nextInt();
        System.out.print("Enter college:");
        String college = sc.next();
        Student st = new Student(name,admissionNumber, rollNumber, college)
        studentList.add(st);
        System.out.println("Student Added Successfully");
    }

    static void viewEmployees() {

        for(int i = 0; i < studentList.size(); i++) {
            System.out.println("------------------------------------------");
            System.out.println("Student name "+ studentList.get(i).name);
            System.out.println("Employee name "+ studentList.get(i).admissionNumber);
            System.out.println("Employee designation "+ studentList.get(i).rollNumber);
            System.out.println("Employee salary "+ studentList.get(i).college);
            System.out.println("------------------------------------------");
        }
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("------------------ Menu ----------------------");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("----------------------------------------------");
            System.out.print("\nPlease enter the choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                case 2:
                    viewStudent();
            }
        }
    }
}