
package DemoException;

import java.util.Scanner;

public class InputDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        double n;
        do {
            try {
                System.out.println("ENter a whole number");
                n = Double.parseDouble(sc.nextLine());
               cont = false;
            } catch(Exception e) {
                System.out.println("Required double!");
            }
        }
        while (cont == true);
    }
}
