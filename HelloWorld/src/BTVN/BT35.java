
package BTVN;

import java.util.Scanner;

public class BT35 {
    public static void main(String[] args) {
        System.out.println("Nhập stn m: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Nhập stn n: ");
        int n = sc.nextInt();
        BT35 ktra = new BT35();
        for (int i=1; i<=m; i++) {
            for(int j=1; j<=n; j++) {
                if((m*j == n*i) && ktra.checkNTCN(i, j)) {
                    System.out.println(i+","+j+"\t");
                }
            }
        }
    }
    public boolean checkNTCN(int a, int b) {
        if(b ==0) 
            return (a==1);
        return checkNTCN(b, a%b);
    }
}
