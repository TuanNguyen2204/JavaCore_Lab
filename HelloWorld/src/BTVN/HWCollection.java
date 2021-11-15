package BTVN;

import java.util.*;

public class HWCollection {

    void f1(ArrayList<Integer> a) {
        //viet chuong trinh sao cho xoa toan bo cac phan tu la so nguyen to trong list      
//        for (int i = 0; i < a.size(); i++) {
//            if (checkNguyenTo(a.get(i))) {
//                a.remove(i);
//                i--;
//            }
//        }
        for(int i=a.size()-1; i>=0; i--){
            if(checkNguyenTo(a.get(i))) {
                a.set(i, a.get(i)+1);
                break;
            }
        }
    }
    
    
    boolean checkNguyenTo(int n) {
        if (n <= 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    

    void f2(ArrayList<Integer> a) {
        //sort tất cả phần tử trong list a theo thứ tự giảm dần(bubble sort, interchange, selection)
        //để thay đổi giá trị tại vị trí nào đó --> dùng
        //a.set(index, value) thay thế giá trị tại vị trí index bằng value       
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size() - i - 1; j++) {
                if (a.get(j) < a.get(j + 1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                }
            }
        }

        //interchane
//         for(int i = 0; i < n - 1; i++) {
//            for(int j = i + 1; j < n; j++) {
//                if (arr[i].compareTo(arr[j]) > 0) {
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
        //selection
        // Duyệt qua từng phần tử của mảng
//        for (int i = 0; i < n - 1; i++) {
//
//            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
//            int min_idx = i;
//            for (int j = i + 1; j < n; j++)
//                if (arr[j] < arr[min_idx])
//                    min_idx = j;
//
//            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
//            int temp = arr[min_idx];
//            arr[min_idx] = arr[i];
//            arr[i] = temp;
//        }
    }

    void f3(ArrayList<Integer> a) {
        //sort tất cả các phần tử là số nguyên tố trong list a, các phần tử khác đứng im
        //sort 5 phần tử đầu tiên(cuối cùng) của list a theo thứ tự tăng(giảm) dần
        //4.thay thế tất cả các số trong list a bằng ước snt lớn nhất của số 
        //5.thay thế tất cả trong số trong list a bằng số đảo ngược của nó 12-21
    }

    void f3_1(ArrayList<Integer> a) {
        //sort tăng dần tất cả các phần tử là số nguyên tố trong list a, các phần tử khác đứng im
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (checkNguyenTo(a.get(i)) && checkNguyenTo(a.get(j)) && a.get(i) > a.get(j)) {
                    int temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
    }

    //sort 5 phần tử đầu tiên(cuối cùng) của list a theo thứ tự tăng(giảm) dần
    void f3_2(ArrayList<Integer> a) {

        //5 pt đầu tiên tăng dần
        for (int i = 0; i <= 4; i++) {
            for (int j = i + 1; j <= 4; j++) {
                if (a.get(i) > a.get(j)) {
                    int temp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
            }
        }
        //5pt cuối tăng dần
//        for(int i=a.size()-1; i>=a.size()-5; i--){
//            for(int j=i-1; j>=a.size() -5; j--){
//                if (a.get(i) < a.get(j)) {
//                    int temp = a.get(i);
//                    a.set(i, a.get(j));
//                    a.set(j, temp);
//                }
//            }
//        }
    }

    void f3_4(ArrayList<Integer> a) {
        //thay thế tất cả các số trong list a bằng ước snt lớn nhất của số 
        for (int i = 0; i < a.size(); i++) {
            a.set(i, UocNTLonNhat(a.get(i)));
        }
    }

    int UocNTLonNhat(int x) {
        int max = 0;
        for (int i = x; i >= 2; i--) {
            if (checkNguyenTo(i) && x % i == 0) {
                max = i;
                break;
            }
        }
        return max;
    }

    void f3_5(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            a.set(i, reverseNumber(a.get(i)));
        }
    }

    int reverseNumber(int number) {
        int reverse = 0;
        int lastDigit = 0;
        while (number >= 1) {
            lastDigit = number % 10; // gives the last digit of the number  
            reverse = reverse * 10 + lastDigit;
            number = number / 10; // removes the last digit of the number  
        }
        return reverse;
    }

    void f4(ArrayList<Integer> a) {
        //1.tính và trả về tổng của 5 số đầu tiên có trong list a
        //2.đếm và trả về số các số là chính phương có trong list a
        //3.tính và trả về tổng, hiệu, tích, thương của số lớn nhất và bé nhất trong list a
        //4.tính tổng các số nằm ở nửa đầu của list a(không tính phần tử ở giữa);
    }
    
    //1.tính và trả về tổng của 5 số đầu tiên có trong list a
    int f4_1(ArrayList<Integer> a) {
        return sum5NumFirst(a);
    }

    int sum5NumFirst(ArrayList<Integer> a) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += a.get(i);
        }
        return sum;
    }
    //2.đếm và trả về số các số là chính phương có trong list a

    int f4_2(ArrayList<Integer> a) {
        return countSquare(a);
    }

    int countSquare(ArrayList<Integer> a) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (isSquare(a.get(i))) {
                count++;
            }
        }
        return count;
    }

    boolean isSquare(int a) {
        for (int i = 0; i <= a; i++) {
            if (i * i == a) {
                return true;
            }
        }
        return false;
    }

    //3.tính và trả về tổng, hiệu, tích, thương của số lớn nhất và bé nhất trong list a
    int f4_3(ArrayList<Integer> a) {
        return max(a) + min(a);
    }

    int max(ArrayList<Integer> a) {
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (max < a.get(i)) {
                max = a.get(i);
            }
        }
        return max;
    }

    int min(ArrayList<Integer> a) {
        int min = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (min > a.get(i)) {
                min = a.get(i);
            }
        }
        return min;
    }

    //4.tính tổng các số nằm ở nửa đầu của list a(không tính phần tử ở giữa);
    int f4_4(ArrayList<Integer> a) {
        return sumOFHalf(a);
    }

    int sumOFHalf(ArrayList<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size() / 2; i++) {
            sum = sum + a.get(i);
        }
        return sum;
       
    }

}




class Using {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.println("Input size of collection: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            ar.add(rd.nextInt(100));//sinh ra so ngau nhien tu 0-99
        }
        HWCollection hw = new HWCollection();
        System.out.println("before process: " + ar);
        //hw.f2(ar);
        hw.f1(ar);
        System.out.println("after process: " + ar);
    }
}
