//Emirp Number là số nt và viết ngược lại số đó cũng là snt
//vd 13, 17, 31, 37, 71, 73, 79, 97, 107, 113, 149, 157...
package Sohoc;

import static Sohoc.CheckSoNguyenTo.checkSnt;
import java.util.Scanner;

public class EmirpNumber {

    public static void main(String[] args) {
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (checkEmirpNumber(n)) {
            System.out.println(n + " la Emirp Number");
        } else {
            System.out.println(n + " không phải Emirp Number");
        }
    }

    public static boolean checkEmirpNumber(int n) {
        if (checkSnt(n) == false) {
            return false;
        }
        //Find reverse of n
        int rev = 0;
        while (n != 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n /= 10;
        }

        // If both Original and Reverse are Prime,
        // then it is an Emirp number
        return checkSnt(rev);
    }
}
