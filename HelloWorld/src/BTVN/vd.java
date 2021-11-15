import java.util.Random;
import java.util.Scanner;

public class vd {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        int [][]A = new int[n][n];
        randomArray(A, n);
        optionA(A, n);
        optionB(A, n);
    }

    public static void randomArray(int [][]A, int n){
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = rd.nextInt(21) - 10;
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void optionA(int [][]A, int n){
        int total = 0;
        System.out.println("i + j chia het cho 3: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i+j) % 3 == 0){
                    System.out.print(A[i][j] + "\t\t");
                    total+= A[i][j];
                }
            }
        }
        System.out.println("\nTotal: " + total);
    }
    public static void optionB(int [][]A, int n){
        int countPosittive = 0;
        float totalPositive = 0;
        System.out.println("so nguyen duong trong ma tran");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(A[i][j] > 0){
                    System.out.print(A[i][j] + "\t\t");
                    totalPositive += A[i][j];
                    countPosittive ++;
                }
            }
        }
        float average = totalPositive / countPosittive;
        System.out.println("\naverage positive number: " + average);
    }
}