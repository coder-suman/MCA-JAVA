//Design a java application that claculate the sum of the first N natural numbers using an iterative approach. The program should accept the value of N from the user and compute the sum using a loop construct, reinforcing the concept of accumulation and repetition in programming
import java.util.Scanner;
class calculate_sum{
    int num,sum;
    calculate_sum(int a){
        this.num=a;
    }
    void cal_sum(){
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("The sum of n number: "+sum);
    }
}
public class assignment_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number(n): ");
        int num=sc.nextInt();
        calculate_sum cs=new calculate_sum(num);
        cs.cal_sum();
    }
}
