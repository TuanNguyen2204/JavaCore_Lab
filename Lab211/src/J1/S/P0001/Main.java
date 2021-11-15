package J1.S.P0001;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        RandomArray ra = new RandomArray();
        Random rand = new Random();

        System.out.print("Enter number of array: ");

        int size = ra.sizeOfArray();

        int[] arr = ra.randomArray(size);

        System.out.print("Unsorted array: ");
        ra.printArray(arr);

        bs.bubbleSort(arr);

        System.out.print("Sorted array: ");
        ra.printArray(arr);
    }
}
