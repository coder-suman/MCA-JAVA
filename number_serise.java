import java.util.Scanner;
class Num_series{
    int a=0;
    int [] arr;
    int sum=0;
    int avg=0;
    Num_series(int a){
        this.a=a;
        arr=new int[a];
    }
    void gen_number_series(){
        for(int i=0;i<a;i++){
            arr[i]=i+2;
        }
    }
    void display_series(){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void sum_number(){
        for(int num:arr){
            sum=sum+num;
        }
        System.out.println("The sum of all number is: "+sum);
    }
    void avg_number(){
         for(int num:arr){
            avg=avg+num;
        }
        avg=avg/arr.length;
        System.out.println("The average of all number: "+avg);
    }
} 
public class number_serise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How meny number you want to generate: ");
        int num=sc.nextInt();
        Num_series ns=new Num_series(num);
        ns.gen_number_series();
        ns.display_series();
        ns.sum_number();
        ns.avg_number();

        
    }
}
