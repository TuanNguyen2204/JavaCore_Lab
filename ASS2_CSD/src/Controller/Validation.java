/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Scanner;

/**
 *
 * @author Tuan
 */
public class Validation {
    public Scanner scanner = new Scanner(System.in);
    public int inputInt(String mess, int min, int max) {
        System.out.print(mess);
        int number;
        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.err.println("Input invalid! Please enter from " + min + " to " + max);
                    System.out.print("Re-enter: ");
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Input invalid! Please enter a number!");
                System.out.print("Re-enter: ");
            }
        } while (true);
    }

    public double inputDouble(String mess, double min, double max) {
        System.out.print(mess);
        double number;
        do {
            try {
                number = Double.parseDouble(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.err.println("Input invalid! Please enter from " + min + " to " + max);
                    System.out.print("Re-enter: ");
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Input invalid! Please enter a number!");
                System.out.print("Re-enter: ");
            }
        } while (true);
    }

    public String inputString(String mess) {
        System.out.print(mess);
        String s;
        do {
            s = scanner.nextLine().trim();
            if (s.isEmpty()) {
                System.out.println("Input invalid. Please don't enter a blank/empty string!");
                System.out.print("Re-enter: ");
            } else {
                return s;
            }
        } while (true);
    }

}
