
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Validation {
    public static Scanner in = new Scanner(System.in);
    public static int inputInt(String p) {
        String tmp;
        int i = 0;

        do {
            System.out.print(p);
            try {
                tmp = in.nextLine();
                if (Integer.parseInt(tmp) == Integer.parseInt(tmp)) {
                    i = Integer.parseInt(tmp);
                }
                break;
            } catch (NumberFormatException e) {
                System.err.print("You must be enter interger number, enter again.\n");
            }
        } while (true);
        return i;
    }
    
    
    public static float inputFloat (String p) {
        String tmp;
        float num;
        do {
            System.out.print(p);
            try {
                num = Float.parseFloat(in.nextLine());
                if (num > 0f && num < Float.MAX_VALUE ) {
                   return num;
                }
                else{
                    System.out.println("Totsl area must be greater than 0!");
                }} catch (Exception e) {
                System.err.print("Invalid input, enter again.\n");
            }
        } while (true);

    }
    
    public static String inputName(String s) {

        String name = "";
        String str = "";
        do {
            System.out.print(s);
            name = in.nextLine();
            if (name.isEmpty()) {
                System.err.println("You must enter a string! Re-enter.");
            } else {
                if (isLetter(name) || name.contains(" ")) {
                    name = name.replaceAll("\\s+", " ").trim();
                    str = str + Character.toUpperCase(name.charAt(0));
                    for (int i = 1; i < name.length(); i++) {
                        if (name.charAt(i) == ' ') {
                            str = str + name.charAt(i) + Character.toUpperCase(name.charAt(i + 1));
                            i++;
                        } else {
                            str = str + Character.toLowerCase(name.charAt(i));
                        }
                    }
                    break;
                } else {
                    System.err.println("Name must be a letter! Re-enter.");
                }
            }
        } while (true);
        return str;
    }
    public static boolean isLetter(String p) {
        boolean check = true;
        for (int i = 0; i < p.length(); i++) {
            if (!Character.isLetter(p.charAt(i))) {
                check = false;
            }
        }
        return check;
    }
}
    
