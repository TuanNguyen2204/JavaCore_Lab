package BTString;

import java.util.Scanner;

class Bai2 extends HomeWork {

    //kiểm tra trong chuỗi có bao nhiêu từ có 
    //1.Độ dài > 3
    //2.Có 1 chữ in hoa
    //3.Có 1 số
    int ktra1(String s) {
        int count = 0;
        String[] word = s.split("\\s+");
        for (String a : word) {
            if (check3word(a) == true && oneUpperCase(a) == 1 && _2Digit(a) == 1) {
                count++;
            }
        }
        return count;
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

    //kiểm tra trong chuỗi có bao nhiêu từ có 
    //1.Bắt đầu bằng chữ in hoa
    //2.Có chứa đúng 2 nguyên âm 
    //3.Độ dài >3
    //4.Kết thúc bằng n
    int ktra2(String s) {
        int count = 0;
        String[] w = s.split("\\s+");
        for (String a : w) {
            if (firstUpperCase(a) && ktra(a) && checkEndWithn(a)) {
                count++;
            }
        }
        return count;
    }
    
    //Kiểm tra trong chuỗi có bao nhiêu từ có:
    //1.Số kí tự là số chẵn
    //2.kết thúc bằng 1 chữ số
    //3.Có chứa nguyên âm
    int kiemTra3(String s){
        int count = 0;
        String[] w =s.split("\\s+");
        for(String a : w){
            if(vowel(a) && a.length()%2==0 && ktra3(a)){
                count++;
            }
        }
        return count;
    }
}

public class f1 {

    public static void main(String[] args) {
        Bai2 HW = new Bai2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string s = ");
        String s = sc.nextLine();
        System.out.println("Bai 1: Số từ thỏa mãn là: " + HW.ktra1(s));
        System.out.println("Bai 2: Số từ thỏa mãn là: " + HW.ktra2(s));
        System.out.println("Bai 2: Số từ thỏa mãn là: " + HW.kiemTra3(s));
    }
}
