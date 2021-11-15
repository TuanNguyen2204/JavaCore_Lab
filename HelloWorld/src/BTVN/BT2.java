//Xóa phần tử trùng nhau trong mảng
//tạo 1 mảng trung gian
package BTVN;

import java.util.Scanner;

public class BT2 {

    public static void main(String[] args) {
        System.out.println("Nhap so luong phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mangNguyen = new int[n];
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < mangNguyen.length; i++) {
            mangNguyen[i] = sc.nextInt();
        }

        int[] mangMoi = new int[n];
        int count = 0;
        boolean timThay;
        for (int i = 0; i < mangNguyen.length; i++) {//xét từng phần tử mảng nguyên
            timThay = false; //sau khi tìm thấy phần tử trùng nhau reset lại biến đánh dấu = false
            for (int j = 0; j < count; j++) {//xét từng phần tử mảng mới
                if(mangMoi[j] == mangNguyen[i]) {
                    timThay = true;
                    break;
                }
            }
            if(!timThay) {//nếu giá trị mangNguyen[i] khác gtri mangMoi[j]
                mangMoi[count] = mangNguyen[i];
                count++;
            }
        }
        System.out.println("Mảng ban đầu: ");
        for(int i: mangNguyen) {
            System.out.println(i + " ");
        }
        System.out.println("Mảng con lớn nhất: ");
        for (int i = 0; i<count; i++) {
            System.out.println(mangMoi[i] + " ");
        }
    }
}
