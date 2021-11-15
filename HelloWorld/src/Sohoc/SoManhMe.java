// So manh me la so chia het cho snt va bình phương snt đó
//vd 1, 4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 72, 81, 100, 108, 
package Sohoc;
import static Sohoc.CheckSoNguyenTo.checkSnt;
//Hàm con
//public class SoManhMe extends CheckSoNguyenTo {
import java.util.Scanner;
public class SoManhMe {
    public static void main(String[] args) {
          System.out.println("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (checkSoManhMe(n)) {
            System.out.println(n + " la so manh me");
        } else {
            System.out.println(n + " khong phai so manh me");
        }
    }

    public static boolean checkSoManhMe(int num) {
        for (int i = 1; i < num; i++) {
            if (checkSnt(i) && (num % i == 0) && (num % (i * i) == 0)) {
                return true;
            }
        }
        return false;
    }
}
