package Array;

import java.util.Scanner;

public class ArrayStackMain {
    public static void main(String[] args) {
        int choice;
        int x, k;
        Scanner sc = new Scanner(System.in);
        ArrayStack d = new ArrayStack();
        Integer X;
        while (true) {            
            System.out.println();
            System.out.println("1.Push");
            System.out.println("2.Top");
            System.out.println("3.Pop");
            System.out.println("4.Display all");
            System.out.println("5. Delete any");
            System.out.println("0.Exit");
            System.out.println("   Your selection(0 -> 5):  ");
            choice = sc.nextInt();
            if(choice == 0) {
                break;
            }
            switch(choice) {
                case 1: 
                    System.out.print("Enter the value to be pushed: ");
                    x = sc.nextInt();
                    X = new Integer(x);
                    d.push(x);
                    break;
                case 2: 
                    System.out.println("The value at the top is: "+ d.top());
                    break;
                case 3:
                    System.out.println("The element poped is: "+ d.pop());
                    break;
                case 4:
                    d.displayAll();
                    break;
                case 5: 
                    System.out.println("Vi tri can xoa: ");
                    int index = sc.nextInt();
                            d.delAny(index);
                            break;
            }
        }
    }
}
