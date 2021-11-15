package BTVN;

import java.util.Scanner;

public class BT7 {

    public static void main(String[] args) {
        int a, b, c, r, h;
        System.out.println("Nhap so để chọn chuong trinh: ");
        System.out.println("1.Diện tích hình thang");
        System.out.println("2.Diện tích tam giác");
        System.out.println("3.Diện tích hình tròn");
        System.out.println("4.Thể tích hình hộp");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BT7 dt = new BT7();
        switch (n) {
            case 1:
                a = dt.nhapDoDai("Nhập đáy: ");
                b = dt.nhapDoDai("Nhập đáy: ");
                h = dt.nhapDoDai("Nhập chiều cao: ");
                System.out.println("Diện tích hình thang: " + 1.0 / 2 * (a + b) * h);
                break;
            case 2:
                a = dt.nhapDoDai("Nhập cạnh a: ");
                b = dt.nhapDoDai("Nhập cạnh b: ");
                c = dt.nhapDoDai("Nhập cạnh c: ");
                float p = (float) ((a + b + c) / 2);
                System.out.println("Diện tích tam giác: " + (float) (Math.sqrt(p * (p - a) * (p - b) * (p - c))));
                break;
            case 3:
                r = dt.nhapDoDai("Nhập bán kính hình tròn: ");
                System.out.println("Diện tích hình tròn: " + (float)r * r * 3.14);
                break;
            case 4:
                a = dt.nhapDoDai("Nhập cdai: ");
                b = dt.nhapDoDai("Nhập crong: ");
                c = dt.nhapDoDai("Nhập chiều cao: ");
                System.out.println("Thể tích hình hộp: " + a * b * c);
                break;
            default:
                System.out.println("Không hợp lệ");
        }
    }
    public int nhapDoDai(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        int x = sc.nextInt();
        return x;
    }
}