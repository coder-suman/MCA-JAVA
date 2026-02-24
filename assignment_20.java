import java.util.Scanner;
class Employee{
    int emp_id,salary;
    int hour_rate=300;
    String emp_name;
    Employee(int id,String name){
        emp_id=id;
        emp_name=name;
    }

    void calculate_salary(int hours){
        salary=hour_rate*hours;
    }
    void display_salary(){
        System.out.println("-------------------------------------");
        System.out.println("Emp_Id: "+emp_id);
        System.out.println("Emp_Name: "+emp_name);
        System.out.println("Salary: "+salary);
        System.out.println("-------------------------------------");
    }
}
public class assignment_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Emp_Id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Emp_name: ");
        String name=sc.nextLine();
        System.out.print("Enter working hours: ");
        int hours=sc.nextInt();
        Employee ep=new Employee(id, name);
        ep.calculate_salary(hours);
        ep.display_salary();
    }
}
