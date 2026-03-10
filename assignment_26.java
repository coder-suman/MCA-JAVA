import java.util.Scanner;
class Matrix{
    void take_input(int [][]matrix,Scanner sc){
         int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(i+" , "+j+" : ");
                matrix[i][j]=sc.nextInt();
            }
            System.out.println();
        }
    }
    void display(int [][]matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    void addition_matrix(int [][]mat1,int [][]mat2){
        int row=mat1.length;
        int col=mat1[0].length;
        int [][]add=new int[row][col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                add[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        display(add);
    }

    void transpose_matrix(int [][]matrix){
         int row=matrix.length;
        int col=matrix[0].length;
        int [][]trans=new int[row][col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                trans[i][j]=matrix[j][i];
            }
        }
        display(trans);
    }

    void diagonal_Sum(int [][]matrix){
        int sum1=0;
        int sum2=0;
        int n=matrix.length;
        for(int i=0;i<n;i++){
            sum1+=matrix[i][i];
            sum2+=matrix[i][n-1-i];
        }
        System.out.println("principal Diagonal Sum: "+sum1);
        System.out.println("secondary Diagonal Sum: "+sum2);
    }
}
public class assignment_26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------Matrix 1---------------");
        System.out.println("Enter number of element in row: ");
        int row=sc.nextInt();
        System.out.println("Enter number of element in Column: ");
        int col=sc.nextInt();
        int [][] matrix1=new int[row][col];
        int [][]matrix2=new int[row][col];
        Matrix mat=new Matrix();

        //take input
        System.out.println("Enter element of matrix 1: ");
        mat.take_input(matrix1, sc);
        System.out.println("Enter element of matrix 2: ");
        mat.take_input(matrix2, sc);

        //display matrix
        System.out.println("---------Display matrix 1----------");
        mat.display(matrix1);
        System.out.println("---------Display matrix 2----------");
         mat.display(matrix2);

        //addition of matrix
        System.out.println("--------------Addition of Matrix----------");
        mat.addition_matrix(matrix1, matrix2);

        //transpose matrix
        System.out.println("-----------Transpose--------");
        mat.transpose_matrix(matrix1);

        //Diagonal sum
        System.out.println("-------------Diagonal sum---------");
        mat.diagonal_Sum(matrix2);
    }
}
