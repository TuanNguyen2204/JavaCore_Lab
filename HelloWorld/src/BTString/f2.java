package BTString;

import java.util.Scanner;

class Bai3 extends HomeWork {

    //Tìm và trả về từ đầu tiên trong chuỗi thỏa mãn điều kiện
    //1.có độ dài > 3
    //2.có chính xác 2 nguyên âm
    String b3_1(String s) {
        String result = "";
        String[] w = s.split("\\s+");
        for (String a : w) {
            if (ktra(a)) {
                result = result + a;
                break;
            }
        }
        return result;
    }

    //Tìm và trả về từ cuối cùng trong chuỗi thỏa mãn điều kiện
    //1.Độ dài > 3
    //2.Có 1 chữ in hoa
    //3.Có 1 số
    String b3_2(String s) {
        String result = "";
        String[] w = s.split("\\s+");
        for (int i = w.length - 1; i >= 0; i--) {
            if (check3word(w[i]) == true && oneUpperCase(w[i]) == 1 && _2Digit(w[i]) == 1) {
                result = result + w[i];
                break;
            }
        }
        return result;
    }

    int oneUpperCase(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.codePointAt(i) >= 65 && s.codePointAt(i) <= 90) {
                count++;
            }
        }
        return count;
    }

    //Tìm và trả về từ đầu tiên trong chuỗi thỏa mãn điều kiện
    //1.Bắt đầu bằng chữ in hoa
    //2.Có chứa đúng 2 nguyên âm 
    //3.Độ dài >3
    //4.Kết thúc bằng n
    String b3_3(String s) {
        String result = "";
        String[] w = s.split("\\s+");
        for (String a : w) {
            if (firstUpperCase(a) && ktra(a) && checkEndWithn(a)) {
                result = result + a;
                break;
            }
        }
        return result;
    }
}  

    public class f2 {

        public static void main(String[] args) {
            System.out.println("Nhập chuỗi : ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            Bai3 HW = new Bai3();
            System.out.println("Bài 1: " + HW.b3_1(s));
            System.out.println("Bài 2: " + HW.b3_2(s));
            System.out.println("Bài 3: " + HW.b3_3(s));

        }
    }
