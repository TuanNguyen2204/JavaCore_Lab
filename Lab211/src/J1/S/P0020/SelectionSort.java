package J1.S.P0020;

import java.util.Scanner;

/**
 *
 * @author Tuan
 */
public class SelectionSort {

    int checkInput() {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            while (!sc.hasNextInt()) {
                String input = sc.next();
                System.out.println("\"" + input + "\" Invalid! Enter a positive decimal number.");
                System.out.print("Enter again: ");
            }
            size = sc.nextInt();
            if (size <= 0) {
                System.out.println("\"" + size + "\" is not a positive decimal number, you need to enter a positive decimal number.");
                System.out.print("Enter again: ");
            }
        } while (size <= 0);
        return size;
    }

    void selectionSort(int[] arr) {
        int i, j, minIndex, temp = 0;
        int n = arr.length;
        for (i = 0; i < n; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                minIndex = j;
                }
            }
           temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
        }
    }
    //9 4 3 2 1
    //1 9 4 3 2 


String printArrData(int[] arr) {
        String rs = "[";
        for (int i = 0; i < arr.length; i++) {
            rs += arr[i];
            if (i < arr.length - 1) {
                rs += ", ";
            }
        }
        rs += "]\n";
        return rs;
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int size = ss.checkInput();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input element a[" + i + "]: ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Unsorted Array: " + ss.printArrData(a));
        ss.selectionSort(a);
        System.out.print("Sorted Array: " + ss.printArrData(a));

    }
}

