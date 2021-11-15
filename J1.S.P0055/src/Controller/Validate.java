package Controller;

import Model.Doctor;
import java.util.ArrayList;
import java.util.Scanner;

public class Validate {
    private final String digit = "^[0-9]+$";

     public static Scanner sc = new Scanner(System.in);

    ArrayList<Doctor> listDoctor = new ArrayList<>();

    public int getIntLimit(int min, int max) {
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                if (input < min || input > max) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Input choice: ");
            }
        }
    }

    //check user input string
    public String getInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
    
    public String checkInputOfString() {
        String input;
        while(true){
            input = sc.nextLine().trim();
            if(input.isEmpty()){
                return null;
            }
            else{
                return input;
            }
        }
    }
    
     public int checkInputOfAvailability() {
         String input;
        while(true){
            input = sc.nextLine().trim();
            if(input.isEmpty()){
                return -1;
            }
            if(!input.matches(digit)){
                System.out.println("Wrong input");
                System.out.print("Please reinput: ");
            }
            else{
                return Integer.parseInt(input);
            }
        }
    }


    public int getAvailability() {
        System.out.println("Input availability: ");
        int avail;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Enter an integer positive number: ");
            }
            avail = sc.nextInt();
            if (avail < 0) {
                System.out.println("Invalid input. Enter an integer positive number: ");
            }
        } while (avail < 0);
        return avail;

    }

    public boolean checkDuplicateCode(String code, ArrayList<Doctor> listDoctor) {
        for (Doctor doctor : listDoctor) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return false;
            }
        }
        return true;
    }
}
