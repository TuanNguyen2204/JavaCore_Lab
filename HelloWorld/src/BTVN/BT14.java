
package BTVN;

import java.util.Scanner;

public class BT14 {
    int n;

    public BT14(int n) {
        this.n = n;
    }
    static boolean isPrime(int n){
            int i;
            if(n <= 1){
                return false;
            }
            for( i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
            return  true;
        }
    void check(){
        int i;
        for(i = 2; i <= n;i++){
            if(n % i == 0 && isPrime(i) == true){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N: ");
        a = sc.nextInt();
        
        BT14 kt = new BT14(a);
        kt.check();
    }
}
