import java.util.Scanner;
class Student{
Scanner sc=new Scanner(System.in);
    int id;
    String name,course,university;
    void set_details(){
        System.out.print("Enter Student Id: ");
        this.id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        this.name=sc.nextLine();
        System.out.print("Enter Course Name: ");
        this.course=sc.nextLine();
        System.out.print("Enter University: ");
        this.university=sc.nextLine();
    }
    void get_details(){
        System.out.println("--------------Student Details---------------");
        System.out.println("St.Id: "+ id);
        System.out.println("Name: "+name);
        System.out.println("Course Name: "+course);
        System.out.println("University: "+university);
        System.out.println("-------------------------------------------");
    }
}
public class assignment_19 {
    public static void main(String[] args) {
        Student st=new Student();
        st.set_details();
        st.get_details();
    }
}
