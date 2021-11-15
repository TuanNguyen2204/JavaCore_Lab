package BTString;

import java.util.Scanner;

class SortWord extends HomeWork {
//Sắp xếp từ trong chuỗi thỏa mãn điều kiện chỉ chứa các kí tự anphabet theo thứ tự tăng dần trong từ điển

    static int count = 0;
    static int dem = 0;
    static int count3 = 0;

    boolean ktraInhoaInthuong(String s) {
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    void sort1(String[] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (ktraInhoaInthuong(s[i]) && ktraInhoaInthuong(s[j]) && s[i].compareTo(s[j]) > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }

    String f3_1(String s) {
        String[] w = s.split("\\s+");
        sort1(w);
        for (int i = 0; i < w.length; i++) {
            if (ktraInhoaInthuong(w[i]) == true) {
                count++;
            }
        }
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + " " + w[i];
        }
        return result;
    }

    //sắp xếp các từ trong chuỗi thỏa mãn điều kiện chỉ có 2 nguyên âm và độ dài > 3
    String f3_2(String s) {
        String[] w = s.split("\\s+");
        sort2(w);
        for (int i = 0; i < w.length; i++) {
            if (ktra(w[i]) == true) {
                dem++;
            }
        }
        String s2 = "";
        for (int i = 1; i < dem; i++) {
            s2 = s2 + " " + w[i];
        }
        return s2;
    }

    void sort2(String[] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (ktra(s[i]) && ktra(s[j]) && s[i].compareTo(s[j]) > 0) {                   
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }

    //sắp xếp các từ trong chuỗi thỏa mãn điều kiện 
    //kí tự dầu tiên in hoa
   //theo thứ tự xuất hiện trong từ điển
    String f3_3(String s) {
        String[] w = s.split("\\s+");
        sort3(w);
        for(int i=0; i<w.length; i++){
            if(firstUpperCase(w[i])){
                count3++;
            }
        }
        String s3 = "";
        for(int i=0; i<count3; i++){
            s3= s3+ " " + w[i];
        }
        return s3;
    }

    void sort3(String[] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if(firstUpperCase(s[i]) && firstUpperCase(s[j]) && s[i].compareTo(s[j]) > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }
}

public class f3 {

    public static void main(String[] args) {
        System.out.println("Nhập chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        SortWord sw = new SortWord();
        System.out.println("Bai 1: " + sw.f3_1(s));
        System.out.println("Bai 2: " + sw.f3_2(s));
        System.out.println("Bai 4: " + sw.f3_3(s));

    }
}
