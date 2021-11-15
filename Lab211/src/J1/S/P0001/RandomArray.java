/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0001;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
     int sizeOfArray() {
        Scanner scan = new Scanner(System.in);
        int size;
        do {
            while (!scan.hasNextInt()) {
                String input = scan.next();
                System.out.println("\""+input+"\" is not number, you need to enter a decimal number!");
                System.out.print("Enter again: ");
            }
            size = scan.nextInt();
            if (size < 0) {
                System.out.println("\""+size+"\" is negative number, you need to enter a positive decimal number!");
                System.out.print("Enter again: ");
            }
        } while (size < 0);
        return size;
    }
     
    int[] randomArray(int size){
        int[] arr = new int[size];
        Random rd = new Random(); 
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(size);
        }
        return arr;
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
