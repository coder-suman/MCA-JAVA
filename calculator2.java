import java.util.Scanner;
class Calculate{
    double add(double a,double b){
        return a+b;
    }
     double sub(double a,double b){
        return a-b;
    }
     double div(double a,double b){
        return a/b;
    }
     double mult(double a,double b){
        return a*b;
    }
}
public class calculator2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculate ct=new Calculate();
        double result=0;

        
            System.out.println("-------------Menu Driven Calculator------------");
            System.out.println("1- Addition");
            System.out.println("2- subtraction");
            System.out.println("3- Multiplication");
            System.out.println("4- Division");
            
            System.out.println("Enter Your Choice: ");
            int ope=sc.nextInt();
            if(ope>=1 && ope<=4){
                System.out.println("Enter 1st num: ");
                double num1=sc.nextDouble();
                System.out.println("Enter 2nd num: ");
                double num2=sc.nextDouble();
                switch (ope) {
            case 1:
                result=ct.add(num1,num2);
                break;
             case 2:
                result=ct.sub(num1,num2);
                break;
             case 3:
                result=ct.mult(num1,num2);
                break;
             case 4:
                result=ct.div(num1,num2);
                break;
            default:
                System.out.println("Please Enter correct operator... ");
                break;
         }
        System.out.println("Result of "+num1+ope+num2+"= "+result);

                
            }
            else{
                System.out.println("Please Enter correct operator...");
            }

            


        
    }
}
