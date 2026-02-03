import java.util.Scanner;
class Employee{
     int emp_id;
     String emp_name;
    Employee(int emp_id,String emp_name){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
    }
    double cal_salary(){
        return 0;
    }
}
class FulltimeEmployee extends Employee{
    double basic,da,hra,salary;
    FulltimeEmployee(int id, String name,double basic, double da, double hra){
        super(id, name);
        this.basic=basic;
        this.da=da;
        this.hra=hra;
        this.salary=cal_salary();
    }
    double cal_salary(){
        return basic+da+hra;
    }
    void display(){
        System.out.println("----------------------Fulltime Employee---------------");
        System.out.println("Emp_id: "+this.emp_id);
        System.out.println("Name: "+this.emp_name);
        System.out.println("Salary: "+salary);
        System.out.println("---------------------------------------------------");
    }
}
class ContractualEmployee extends Employee{
    double workhour,salary;
    double rate;
    ContractualEmployee(int emp_id, String emp_name, double workhour,double rate){
        super(emp_id,emp_name);
        this.workhour=workhour;
        this.rate=rate;
        this.salary=cal_salary();

    }
    double cal_salary(){
        return workhour*rate;
    }
     void display(){
        System.out.println("----------------Contractual Employee------------");
        System.out.println("Emp_id: "+this.emp_id);
        System.out.println("Name: "+this.emp_name);
        System.out.println("Salary: "+salary);
        System.out.println("------------------------------------------------");
    }
}
public class assignment_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("---------Enter Fulltime Employee Details------");
        System.out.println("Enter emp_id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter emp_name: ");
        String name=sc.nextLine();
        System.out.println("Enter Basic: ");
        double basic=sc.nextDouble();
        System.out.println("Enter Da: ");
        double Da=sc.nextDouble();
        System.out.println("Enter HRA: ");
        double HRA=sc.nextDouble();
        FulltimeEmployee fe=new FulltimeEmployee(id,name,basic,Da,HRA);
        fe.display();
        System.out.println("------------------------------------------------");

        System.out.println("---------Enter Contractual Employee Details------");
        System.out.println("Enter emp_id: ");
        int c_id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter emp_name: ");
        String c_name=sc.nextLine();
        System.out.println("Enter work houre: ");
        double wh=sc.nextDouble();
        System.out.println("Enter Rate: ");
        double rate=sc.nextDouble();
        ContractualEmployee ce =new ContractualEmployee(c_id, c_name, wh, rate);
        ce.display();
        System.out.println("------------------------------------------------");
    }
}
