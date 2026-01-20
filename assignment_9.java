//Develop a java program that swaps two numeric values entered by the user. The program should demonstrate the swapping process using a just two vatiable and display the values before and after swapping.
class Swap_num{
    void swap(int num1,int num2){
        System.out.printf("\nNumbers are : %d,%d",num1,num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.printf("\nSwapping numbers are : %d,%d",num1,num2);
    }
}
public class assignment_9 {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        Swap_num sn=new Swap_num();

        System.out.println("Enter 1st number: ");
        int num1=sc.nextInt(); 

        System.out.println("Enter 2nd number: ");
        int num2=sc.nextInt();

        sn.swap(num1, num2);
    }
}

