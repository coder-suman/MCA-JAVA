import java.util.Scanner;

class Num_series {
    int a = 0;
    int[] arr;
    int sum = 0;
    double avg = 0;

    Num_series(int a) {
        this.a = a;
        arr = new int[a];
    }

    void gen_number_series() {
        for (int i = 0; i < a; i++) {
            arr[i] = i + 2;
        }
    }

    void display_series() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void sum_avg_number() {
        for (int num : arr) {
            sum = sum + num;
        }
        System.out.println("The sum of all number is: " + sum);
        avg = sum / arr.length;
        System.out.println("The average of all number: " + avg);
    }

    void min_nax() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            } else if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("The minimum number is:" + min);
        System.out.println("The Maximum number  is: " + max);
    }
}

public class number_serise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How meny number you want to generate: ");
        int num = sc.nextInt();
        Num_series ns = new Num_series(num);
        ns.gen_number_series();
        ns.display_series();
        ns.sum_avg_number();
        ns.min_nax();
    }
}
