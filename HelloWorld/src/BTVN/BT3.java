//Tìm tất cả các số nhó hơn 1000 mà tổng giai thừa các cs tạo nên nó
//bằng chính nó
package BTVN;

public class BT3 {

    public static void main(String[] args) {
        //BT3 number = new BT3();
        for(int i=0; i<1000; i++) {
            if (checkNumber(i)) {
                 System.out.println(i + " ");
            } 
        }
    }

    public static int giaiThua(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean checkNumber(int x) {
        int digit;
        int temp = x;
        int sum = 0;
        while (temp != 0) {
            digit = temp % 10;
            sum = sum + (giaiThua(digit));
            temp /= 10;
        }
        if(sum == x && x !=0) {
            return true;
        }
        else return false;
    }

}
