//Create a java program that generates a simple numeric pattern using iterative statements. The program should produce a structured output such as a right-angled number triangle based on a user-specified limit.
public class assignment_11 {
    public static void main(String[] args) {
        for (int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
