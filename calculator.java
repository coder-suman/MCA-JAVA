import java.util.Scanner;
class Calculation{
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
public class calculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Calculation cl=new Calculation();
        double result=0;

        
        System.out.println("Wellcome in Calculator");
        System.out.println("Enter 1st number: ");
        double num1=sc.nextDouble();
        System.out.println("Enter 2nd number: ");
        double num2=sc.nextDouble();
        System.out.println("Enter operator(+,-,*,/): ");
        String ope=sc.next();
       
        switch (ope) {
            case "+":
                result=cl.add(num1,num2);
                break;
             case "-":
                result=cl.sub(num1,num2);
                break;
             case "*":
                result=cl.mult(num1,num2);
                break;
             case "/":
                result=cl.div(num1,num2);
                break;
            default:
                System.out.println("Please Enter correct operator... ");
                break;
         }
        System.out.println("Result of"+num1+ope+num2+"= "+result);


}
}