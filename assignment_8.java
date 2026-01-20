import java.util.Scanner;

class Temp_convert{
    void conv_fahrenheit(double n){
        double fahrenheit=(n*5/9)+32;
        System.out.printf("\n%.2f degree celcious = %.2f",n,fahrenheit);
    }
}
public class assignment_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Temp_convert tc=new Temp_convert();
        System.out.println("Enter Tempature in celcious: ");
        double n=sc.nextDouble();
        tc.conv_fahrenheit(n);
    }
}
