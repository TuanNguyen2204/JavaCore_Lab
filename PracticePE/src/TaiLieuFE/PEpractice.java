
package TaiLieuFE;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//ascii: Số: từ 48-57; chữ thường từ 91-122; chữ in từ 65-90; dấu cách là 32

//covert từ char sang int:
// int num = Integer.parseInt(char đó + "");
//c2:Integer.parseInt(Character.toString(ch)); 
//c3:nếu char từ '0'-'9': char a = '0';
                //int num = str.charAt(i) - a;

public class PEpractice {
    //kiểm tra Số nguyên tố
      public static boolean checkSnt(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
      boolean isPrime(int n){
            int i;
            if(n <= 1){
                return false;
            }
            for( i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
            return  true;
        }
    //1. tìm và trả về số phần tử lớn hơn giá trị trung bình trong list
    int f1_1(ArrayList<Integer>a){
        int sum  = 0;
        int count = 0;
        for(int i = 0; i < a.size(); i++ ){
            sum += a.get(i);
        }
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > sum/a.size()){
                count++;
            }
        }
        return count;
    }
    //2. tính tổng giá trị của các phần tử lớn hơn giá trị trung bình trong list
    int f1_2(ArrayList<Integer>a){
        int sum  = 0, sum1 = 0;
        int count = 0;
        for(int i = 0; i < a.size(); i++ ){
            sum += a.get(i);
        }
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > sum/a.size()){
                sum1 += a.get(i);
            }
        }
        return sum1;
    }
    //3. Tính và trả về tổng các giá trị ở vị trí không phải là số nguyên tố
    int f1_3(ArrayList<Integer>a){
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if(!isPrime(i)){
                sum+= a.get(i);
            }
        }
        return sum;
    }
    //4. Tính và trả về (phần nguyên) số lớn nhất lớn hơn bao nhiêu lần so với số bé nhất
    int f1_4(ArrayList<Integer>a){
        int max = 0, min = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > max)
                max = a.get(i);
        }
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) < min)
                min = a.get(i);
        }
        return max/min;
    }
    //5. a. xóa bỏ phần tử lớn nhất và bé nhất đầu tiên xuất hiện trong list,
    void f1_5a(ArrayList<Integer>a){
        int max = 0, min = a.get(0);
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > max){
                max = a.get(i);
                maxIndex =i;
            }
                
        }
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) < min){
                min = a.get(i);
                minIndex =i;
            }
            
        }
        a.remove(maxIndex);
        a.remove(minIndex);
    }
    //5 b. tính và trả về giá trị trung bình (phần nguyên) của list đó
    int f1_5b(ArrayList<Integer>a){
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum+= a.get(i);
        }
        return sum/a.size();
    }
    //6. a. xóa bỏ tất cả phần tử lớn nhất và bé nhất xuất hiện trong list,
    void f1_6a(ArrayList<Integer>a){
        int max = 0, min = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > max){
                max = a.get(i);
            }
                
        }
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) < min){
                min = a.get(i);
            }
            
        }
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) == max || a.get(i) == min){
                a.remove(i);
                i--;
            }
                
        }
    }
    
    //7. Tính và trả về giá trị trung bình nửa đầu của list (không xét phần tử giữa (nếu có)
    int f1_7(ArrayList<Integer>a){
        int sum = 0;
        int size = a.size()/2;
        for (int i = 0; i < size; i++) {
            sum = sum + a.get(i);
        }
        return sum/size;
    }
    //8. a-tính giá trị trung bình của các phần tử lớn hơn giá trị trung bình của list
    int f1_8a(ArrayList<Integer>a){
        int sum  = 0, sum1 = 0;
        int count = 0;
        for(int i = 0; i < a.size(); i++ ){
            sum += a.get(i);
        }
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > sum/a.size()){
                sum1 += a.get(i);
                count++;
            }
        }
        return sum1/count;
    }
    //8. b-tính giá trị trung bình của các phần tử nhỏ hơn giá trị trung bình của list
    int f1_8b(ArrayList<Integer>a){
        int sum  = 0, sum1 = 0;
        int count = 0;
        for(int i = 0; i < a.size(); i++ ){
            sum += a.get(i);
        }
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) < sum/a.size()){
                sum1 += a.get(i);
                count++;
            }
        }
        return sum1/count;
    }
    // c-tính và trả về (phần nguyên) giá trị trung bình (a) lớn hơn giá trị trung bình (b) bao nhiêu lần
    int f1_8c(ArrayList<Integer>a){
        return f1_8a(a)/f1_8b(a);
    }
//9. tìm và trả về giá trị có tần suất xuất hiện nhiều nhất trong list
   static int f1_9(List<Integer>a){
       
        int max = 0;
        int result = 0;
        for (int i = 0; i < a.size(); i++) {
             int  count = 0;
            for(int j = 0; j < a.size() ; j++){
                if(a.get(i) == a.get(j)){
                    count++;
                }
            }
            if(count > max){
                max = count;
                result = a.get(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<Integer>();
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        for(int i=0; i<size; i++){
            ar.add(rd.nextInt(10));
        }
        System.out.println(ar);
        System.out.println(f1_9(ar));
    }
     //Bài về collection mà tìm field có chứa cả chữ và số
    public int f1(List<Book> a){
        int count= 0;
        for(Book o : a){
            boolean check1 = false;
            boolean check2= false;
            String code = o.getCode();
            for(int i=0; i<code.length(); i++){
                if(Character.isDigit(code.charAt(i))){
                    check1 = true;
                }
                if(Character.isLetter(code.charAt(i))){
                    check2 = true;
                }
            }
            if(check1 == true && check2 == true){
                count++;
            }
        }
        retrun count;
    }
    //số lơn thứ k trong mảng
    public static int kthSmallest(Integer[] arr,
            int k) {
        // Sort the given array
        Arrays.sort(arr);

        // Return k'th element in
        // the sorted array
        return arr[k - 1];
    }
    
}
