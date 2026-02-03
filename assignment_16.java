import java.util.Scanner;
class bank{
    double balance;
    bank(double balance){
        this.balance=balance;
    }
    void deposit(double amt){
    }
    void withdraw(double amt){
    }
    void display(){

    }
    
}
class mybank extends bank{
    // double balance;
    mybank(double balance){
        super(balance);
    }
    void deposit(double amt){
        if(amt>=0){
            this.balance = balance+amt;
            System.out.println("Deposit Successfull...");
        }else{
            System.out.println("Please enter a positive input...");
        }
        
    }
    void withdraw(double amt){
        if(amt>0 || amt < balance){
            this.balance=balance-amt;
            System.out.println("withdraw successfull...");
        }
    }
    void display(){
        System.out.println("Current Bank Balence: "+balance);
    }
}
public class assignment_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter bank balence: ");
        double amt=sc.nextDouble();
        mybank mb=new mybank(amt);

        System.out.println("Enter Deposit amount: ");
        double dep=sc.nextDouble();
        mb.deposit(dep);

        System.out.println("Enter Withdraw amount: ");
        double withd=sc.nextDouble();
        mb.withdraw(withd);

        mb.display();
    }
}
