class Swap_num{
    void swap(int num1,int num2){
        System.out.printf("\nNumbers are : %d,%d",num1,num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.printf("\nSwaping numbers are : %d,%d",num1,num2);
    }
}
public class assighment_9 {
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
