import java.util.Scanner;
class Check_number{
    String check_pos_neg(int a){
            if(a>0){
                return  "This is a positive...";
            }else if(a<0){
                return "This is a Negetive...";
            }else{
                return "This is Zero...";
            }
        }
        String check_odd_even(int a){
            if (a%2==0){
                return "This an Even Number...";
            }else{
                return "This is an Odd Number...";
            }

        }
        void check_prime(int a){
            int flag=1;
            if(a<=1){
                System.out.println("The number is not prime...");
            }else if(a==2){
                System.out.println("The number is a prime number");
            }else{
                for (int i=2;i<a;i++){
                    if(a%i==0){
                        System.out.println("The number is not prime...");
                        flag=0;
                        break;
                    }
                }
            }

            if(flag==1){
                System.out.println("This is a prime number...");
            }
        }
        void check_palindrome(int a){
            int r=a;
            int rev=0;
           while(a!=0){
                int d=a%10; //d=5,2,5
                rev=(rev*10)+d; //rev=5,52,525
                a=a/10; // a=52,5,0
           }
           if (r==rev){
            System.out.println("This is palindrome...");
           }else{
            System.out.println("This is not a palindrome...");
           }

        }
    
}
public class pos_neg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Check_number ch=new Check_number();
        try{
            System.out.print("Enter a number: ");
            int num=sc.nextInt();
            System.out.println(ch.check_pos_neg(num));
            System.out.println(ch.check_odd_even(num));
            ch.check_prime(num);
            ch.check_palindrome(num);
        }catch(Exception e){
            System.out.println("Please Enter a valid input...");
        }
        
        
        
    }
}
