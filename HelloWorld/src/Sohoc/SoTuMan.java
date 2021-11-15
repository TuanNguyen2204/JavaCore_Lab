//Số tự mãn là những số bằng tổng các mũ bậc ba của mỗi chữ số của nó.
//vd 153 =  1 ^3 + 5 ^3 + 3 ^3     
package Sohoc;

import java.util.Scanner;

public class SoTuMan extends SoAmstrong {

    public static void main(String[] args) {
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (checkSoTuMan(n)) {
            System.out.println(n + " la số tự mãn");
        } else {
            System.out.println(n + " không phải số tự mãn");
        }
    }

    public static boolean checkSoTuMan(int num) {
        if (countDigit(num) == 3 && check(num)) {
            return true;
        } else {
            return false;
        }
    }
}
