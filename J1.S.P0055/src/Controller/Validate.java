package Controller;

import Model.Doctor;
import java.util.ArrayList;
import java.util.Scanner;

public class Validate {

    private final Scanner sc = new Scanner(System.in);

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
                System.out.println("Input again: ");
            }
        }
    }

    public String checkCode() {
        System.out.println("Input Doctor code: ");
        String code;
        while (true) {
            code = sc.nextLine().trim();
            if (code.isEmpty()) {
                System.out.println("Doctor code isn't empty. Enter again: ");
            }
            else return code;
        }
    }

    public String checkName() {
        System.out.println("Input Doctor name: ");
        String name;
        while (true) {
            name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Doctor name isn't empty. Enter again: ");
            }
            else return name;
        }
    }

    public String checkSpecialization() {
        System.out.println("Input Doctor specialization: ");
        String spec;
        while (true) {
            spec = sc.nextLine();
            if (spec.isEmpty()) {
                System.out.println("Doctor specialization isn't empty.Enter again: ");
            }
            else return spec;
        }
    }

    public int checkAvailability() {
        System.out.println("Input availability: ");
        int avail;
        while (true) {
            try {
                avail = Integer.parseInt(sc.nextLine());
                return avail;
            } catch (Exception e) {
                System.out.println("Invalid input. Enter an integer number: ");
            }
        }
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
