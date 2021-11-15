package BTString;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class HomeWork {

    //kiểm tra số từ có >3 kí tự trong chuỗi
    int check1(String s) {
        int count = 0;
        String[] w = s.split("\\s");
        for (String a : w) {
            if (check3word(a)) {
                count++;
            }

        }
        return count;
    }

    boolean check3word(String s) {
        return s.length() > 3;
    }

    //kiểm tra số từ đối xứng trong chuỗi
    int check2(String s) {
        int count = 0;
        String[] ss = s.split("\\s");
        for (String a : ss) {
            if (checkPalindrome(a) == 1) {
                count++;
            }
        }
        return count;
    }

    int checkPalindrome(String s) {
        String reverseString = "";
        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            reverseString = reverseString + s.charAt(i);
        }
        if (s.equals(reverseString)) {
            return 1;
        } else {
            return 0;
        }
    }

    //kiểm tra có bao nhiêu từ bắt đầu bằng chữ t/T trong chuỗi
    int check3(String s) {
        int count = 0;
        String[] ss = s.split("\\s");
        for (String a : ss) {
            if (start_t(a)) {
                count++;
            }
        }
        return count;
    }

    boolean start_t(String s) {
        return (s.startsWith("t") || s.startsWith("T"));
    }

    //Kiểm tra có bao nhiêu từ có chứa kí tự số
    int check4(String s) {
        int count = 0;
        String[] ss = s.split("\\s");
        for (String a : ss) {
            if (Digit(a)) {
                count++;
            }
        }
        return count;
    }

    boolean Digit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    //kiểm tra có bao nhiêu từ có đúng 2 kí tự số
    int check5(String s) {
        int count = 0;
        String[] ss = s.split("\\s");
        for (String a : ss) {
            if (_2Digit(a) == 2) {
                count++;
            }
        }
        return count;
    }

    int _2Digit(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.codePointAt(i) >= 48 && s.codePointAt(i) <= 57) {
                count++;
            }
        }
        return count;
    }

    //kiểm tra có bao nhiêu từ có chứa nguyên âm
    int check6(String s) {
        int count = 0;
        String[] ss = s.split("\\s");
        for (String a : ss) {
            if (vowel(a)) {
                count++;
            }
        }
        return count;
    }

    boolean vowel(String s) {
        char[] chars = s.toCharArray();
        boolean flag = false;
        for (char c : chars) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    flag = true;
            }
        }
        return flag;
    }

    //kiểm tra có bao nhiêu từ có chứa >2 nguyên âm
    int check7(String s) {
        int count = 0;
        String[] ss = s.split("\\s");
        for (String a : ss) {
            if (_2MoreVowel(a) > 2) {
                count++;
            }
        }
        return count;
    }

    int _2MoreVowel(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    //kiểm tra có bao nhiêu từ trong chuỗi có 2 nguyên âm và 1 kí tự chữ số
    int check8(String s) {
        int count = 0;
        String[] ss = s.split("\\s");
        for (String a : ss) {
            if (oneDigit_2Vowel(a)) {
                count++;
            }
        }
        return count;
    }

    boolean oneDigit_2Vowel(String s) {
        return (_2MoreVowel(s) == 2 && _2Digit(s) == 1);
    }

    //kiem tra co bao nhieu tu trong chuoi co so ki tu la so le
    int check9(String s) {
        int count = 0;
        String[] ss = s.split("\\s");
        for (String a : ss) {
            if (countOdd(a)) {
                count++;
            }
        }
        return count;
    }

    boolean countOdd(String s) {
        return (s.length() % 2 == 1);
    }

    //kiểm tra có bao nhiêu từ trong chuỗi kết thúc bằng chữ cái n
    int check10(String s) {
        int count = 0;
        String[] ss = s.split("\\s");
        for (String a : ss) {
            if (checkEndWithn(a)) {
                count++;
            }
        }
        return count;
    }

    boolean checkEndWithn(String s) {
        return (s.endsWith("n"));
    }

    //kiểm tra có bao nhiêu từ trong chuối có nhiều nhất 3 kí tự chữ số
    int check11(String s) {
        int count = 0;
        String[] ss = s.split("\\s");
        for (String a : ss) {
            if (atMost3Digit(a) == true) {
                count++;
            }
        }
        return count;
    }

    boolean atMost3Digit(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.codePointAt(i) >= 48 && s.codePointAt(i) <= 57) {
                count++;
            }
        }
        return count <= 3;
    }

    //kiểm tra chuỗi có bao nhiêu từ chứa kí tự đặc biệt
    int check12(String s) {
        int count = 0;
        String[] ss = s.split("\\s");
        for (String a : ss) {
            if (specialCharacter(a)) {
                count++;
            }
        }
        return count;
    }

    boolean specialCharacter(String s) {
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(s);
        boolean b = m.find();
        return b;
    }

    //kiểm tra chuỗi có bao nhiêu từ bắt đầu bằng chữ in hoa
    int check13(String s) {
        int count = 0;
        String[] ss = s.split("\\s");
        for (String a : ss) {
            if (firstUpperCase(a)) {
                count++;
            }
        }
        return count;
    }

    boolean firstUpperCase(String s) {
        return (s.codePointAt(0) > 64 && s.codePointAt(0) < 91);
    }

    //kiểm tra chuỗi có từ giống nhau hay khong
    String check14(String s) {
        boolean flag = false;
        String[] ss = s.split("\\s+");
        for (int i = 0; i < ss.length; i++) {
            for (int j = i + 1; j < ss.length; j++) {
                if (ss[i].compareTo(ss[j]) == 0) {
                    flag = true;
                }
            }
        }
        if (flag == true) {
            return "Chuỗi bị lặp từ";
        } else {
            return "Chuỗi ko bị lặp từ";
        }
    }

    //kiểm tra chuỗi có bao nhiêu từ chứa chuỗi 123 trong từ đó
    int check15(String s) {
        int count = 0;
        String[] ss = s.split("\\s+");
        for (String a : ss) {
            if (a.contains("123")) {
                count++;
            }
        }
        return count;
    }

    //kiểm tra chuỗi có bao nhiêu từ có 4 kí tự
    int check16(String s) {
        int count = 0;
        String[] ss = s.split("\\s");
        for (String a : ss) {
            if (a.length() == 4) {
                count++;
            }
        }
        return count;
    }

    //kiểm tra trong chuỗi có bn từ có độ dài >3 và có 2 nguyên âm
    int check17(String s) {
        int count = 0;
        String[] ss = s.split("\\s+");
        for (String a : ss) {
            if (ktra(a)) {
                count++;
            }
        }
        return count;
    }

    boolean ktra(String s) {
        int count = 0;
        s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i' || ch == 'o') {
                count++;
            }
        }
        return (count == 2 && s.length() > 3);
    }

    //kiểm tra chuỗi có bn từ có cả kí tự chữ hoa, chữ thường và chữ số
    int check18(String s) {
        int count = 0;
        String[] word = s.split("\\s+");
        for (String a : word) {
            if (Digit(a) && ktraInHoa(a) == true && ktraInThuong(a) == true) {
                count++;
            }
        }
        return count;
    }

    boolean ktraInHoa(String s) {
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.codePointAt(i) >= 65 && s.codePointAt(i) <= 90) {
                flag = true;
            }
        }
        return flag;
    }

    boolean ktraInThuong(String s) {
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.codePointAt(i) >= 97 && s.codePointAt(i) <= 122) {
                flag = true;
            }
        }
        return flag;
    }

    //kiểm tra chuỗi có bao nhiêu từ có số kí tự là số chẵn
    int check19(String s) {
        int count = 0;
        String[] words = s.split("\\s+");
        for (String a : words) {
            if (a.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //kiểm tra từ có nhiều kí tự nhất trong chuỗi
    String check20(String s) {
        String result = "";
        String[] words = s.split("\\s+");
        int[] a = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            a[i] = words[i].length();
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max <= a[i]) {
                max = a[i];
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == max) {
                result = result + words[i] + " ";
            }
        }
        return result;
    }

    //kiểm tra chuỗi có bao nhiêu từ kết thúc bằng kí tự chữ số
    int check21(String s) {
        int count = 0;
        String[] word = s.split("\\s");
        for (String a : word) {
            if (ktra3(a)) {
                count++;
            }
        }
        return count;
    }

    boolean ktra3(String s) {
        return (s.codePointAt(s.length() - 1) >= 48 && s.codePointAt(s.length() - 1) <= 57);
    }

    //kiểm tra chuỗi có bao nhiêu từ có đúng 2 phụ âm
    int check22(String s) {
        int count = 0;
        String[] w = s.split("\\s+");
        for (String a : w) {
            if (phuAm(a)) {
                count++;
            }
        }
        return count;
    }

    boolean phuAm(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.codePointAt(i) >= 97 && s.codePointAt(i) <= 122 && ch != 'a' && ch != 'e' && ch != 'o' && ch != 'i' && ch != 'u') {
                count++;
            }
        }
        return count == 2;
    }

    //kiểm tra chuỗi có bao nhiêu từ dạng sole  vd:tututu
    int check23(String s) {
        int count = 0;
        String[] w = s.split("\\s+");
        for (String a : w) {
            if (ktra4(a)) {
                count++;
            }
        }
        return count;
    }

    boolean ktra4(String s) {
        boolean flag = true;
        if (s.length() % 2 == 0) {
            String[] cut = new String[s.length() / 2];
            for (int i = 0; i < s.length() / 2; i++) {
                cut[i] = s.substring(2 * i, 2 * i + 1);
            }
            for (int i = 0; i < s.length() / 2; i++) {
                for (int j = 0; j < s.length() / 2; j++) {
                    if (!cut[i].equals(cut[j])) {
                        flag = false;
                    }
                }
            }
        }
        return flag;

    }
    //kiểm tra chuỗi có bao nhiêu từ có số kí tự là số lẻ
    int check24(String s){
        int count = 0;
        String[] w = s.split("\\s+");
        for(String a: w){
            if(a.length() % 2 ==1){
                count++;
            }
        }
        return count;
    }
    //kiểm tra chuỗi có bao nhiêu từ chứa "@gmail.com"
    int check25(String s){
        int count = 0;
        String[] w = s.split("\\s+");
        for(String a : w){
            if(a.contains("@gmail.com")){
                count++;
            }
        }
        return count;
    }
}

public class BTVN {

    public static void main(String[] args) {
        HomeWork hw = new HomeWork();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String s= ");
        String s = sc.nextLine();
        System.out.println("Bai 1: " + hw.check1(s));
        System.out.println("Bai 2: " + hw.check2(s));
        System.out.println("Bai 3: " + hw.check3(s));
        System.out.println("Bai 4: " + hw.check4(s));
        System.out.println("Bai 5: " + hw.check5(s));
        System.out.println("Bai 6: " + hw.check6(s));
        System.out.println("Bai 7: " + hw.check7(s));
        System.out.println("Bai 8: " + hw.check8(s));
        System.out.println("Bai 9: " + hw.check9(s));
        System.out.println("Bai 10: " + hw.check10(s));
        System.out.println("Bai 11: " + hw.check11(s));
        System.out.println("Bai 12: " + hw.check12(s));
        System.out.println("Bai 13: " + hw.check13(s));
        System.out.println("Bai 14: " + hw.check14(s));
        System.out.println("Bai 15: " + hw.check15(s));
        System.out.println("Bai 16: " + hw.check16(s));
        System.out.println("Bai 17: " + hw.check17(s));
        System.out.println("Bai 18: " + hw.check18(s));
        System.out.println("Bai 19: " + hw.check19(s));
        System.out.println("Bai 20: Từ dài nhất: " + hw.check20(s));
        System.out.println("Bai 21: " + hw.check21(s));
        System.out.println("Bai 22: " + hw.check22(s));
        System.out.println("Bai 23: " + hw.check23(s));
        System.out.println("Bai 24: " + hw.check24(s));
        System.out.println("Bai 25: " + hw.check25(s));

    }

}
