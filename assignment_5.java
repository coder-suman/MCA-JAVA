import java.util.Scanner;
class Employee{
    Scanner sc=new Scanner(System.in);
    private int emp_id;
    private String emp_name;
    private String designation;
    private String Com_name;
    private int Salary;
    void take_input(){
        System.out.println("----------Enter Details------------");
        System.out.print("Enter Employee Id: ");
        this.emp_id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        this.emp_name=sc.nextLine();
        System.out.print("Enter Designation: ");
        this.designation=sc.nextLine();
        System.out.print("Enter Company Name: ");
        this.Com_name=sc.nextLine();
        System.out.print("Enter Salary: ");
        this.Salary=sc.nextInt();
        System.out.println("-----------------------------------");
    }
    void display_empdetails(){
        System.out.println("--------------Employee Details-------------");
        System.out.printf("Employee Id: %d",emp_id);
        System.out.printf("\nEmployee Name: %s",emp_name);
        System.out.printf("\nDesignation: %s",designation);
        System.out.printf("\nCompany Name: %s",Com_name);
        System.out.printf("\nSalary: %d",Salary);
        System.out.println("\n---------------------------------------------");
    }

}
public class assignment_5 {
    public static void main(String[] args){
        Employee ep=new Employee();
        ep.take_input();
        ep.display_empdetails();
    }
}
