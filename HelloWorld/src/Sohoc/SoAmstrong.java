package Sohoc;
//số amstrong: tổng của từng chữ số với mũ là số cs cộng lại
import java.util.Scanner;

public class SoAmstrong {

    public static void main(String[] args) {
        System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (check(n)) {
            System.out.println(n + " la so Amstrong");
        } else {
            System.out.println(n + " khong phai so Amstrong");
        }
    }
//đếm số chữ số
    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            ++count;
        }
        return count;
    }

    public static boolean check(int x) {
        int remainder = 0, result = 0;
        int temp = x;
        while (temp != 0) {
            remainder = temp % 10;
            result += Math.pow(remainder, countDigit(x));
            temp /= 10;
        }
        if (result == x) {
            return true;
        } else {
            return false;
        }
    }
}
