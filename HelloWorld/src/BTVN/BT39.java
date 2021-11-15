
package BTVN;

import java.util.Scanner;

public class BT39 {

    public static void main(String[] args) {
        BT39 a = new BT39();
        //Nhập dãy số
        int[] x = new int[100];
        int count = 0;
        System.out.println("Nhập dãy số, 0 để dừng");
        while (true) {
            Scanner sc = new Scanner(System.in);
            x[count] = sc.nextInt();
            if (x[count] == 0) {
                break;
            }
            count++;
        }
        System.out.println("A." + a.optionA(x, count));
        System.out.println("B." + a.optionB(x, count));
    }

    public double optionA(int[] x, int n) {
        int sum = 0, count =0;
        for(int i=0; i<n; i++) {
            if(x[i] % 5 ==0) {
                sum += x[i];
                count++;
            }
        }
        return (double)sum/count;
    }

    public int optionB(int[] x, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (x[i]<0 && x[i]%2==0) {
                count++;
            }
        }
        return count;
    }
}

