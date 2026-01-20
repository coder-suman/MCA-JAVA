//Design a java program that accepts three integer values from the user and determines the largest among them using conditional statements. The program should clearly display the input values and the computed result, thereby strengthening understanding of relational operators and decision-making logic.
class found_Max{
    void cal_max(int a,int b,int c){
        if(a>b && a>c){
            System.out.println(a+ " is Max number among three...");
        }else if(b>c && b>a){
            System.out.println(b+ " is Max number among three...");
        }else if (c>a && c>b) {
            System.out.println(c+ " is Max number among three...");
        }
    }
}
public class assignmet_10 {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        found_Max fm=new found_Max();
        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();
         System.out.print("Enter number 2: ");
        int num2=sc.nextInt();
         System.out.print("Enter number 3: ");
        int num3=sc.nextInt();
        fm.cal_max(num1, num2, num3);

    }
}

