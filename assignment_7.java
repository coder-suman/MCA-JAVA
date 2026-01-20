//Design a java program that display a simple personal profile on the console. The program should store basic information such as name, age,console, and institution in appropriate variables and display them using formatted output statements.

import java.util.Scanner;

class Personal {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private String course;
    private String institute;

    void take_input() {
        System.out.println("----------Enter Your Details------------");
        System.out.print("Enter Your Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Your Age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Your Course Name: ");
        this.course = sc.nextLine();
        System.out.print("Enter Your Institute: ");
        this.institute = sc.nextLine();
        System.out.println("-----------------------------------");
    }

    void display_empdetails() {
        System.out.println("--------------Personal Details-------------");
        System.out.printf("\nName: %s", name);
        System.out.printf("\nAge: %d", age);
        System.out.printf("\nCourse Name: %s", course);
        System.out.printf("\nInstitution Name: %s", institute);
        System.out.println("\n---------------------------------------------");
    }

}

public class assignment_7 {
    public static void main(String[] args) {
        Personal p = new Personal();
        p.take_input();
        p.display_empdetails();
    }

}
