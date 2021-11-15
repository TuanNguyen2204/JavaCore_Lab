
import java.util.Scanner;

public class Validate {

    public static Scanner sc = new Scanner(System.in);

    public String formatNumber(String number) {
        if (number.length() == 0) {
            return "0";
        } else if (number.length() == 1) {
            return number;
        } else if (number.charAt(0) == '0') {
            return formatNumber(number.substring(1));
        } else {
            return number;
        }
    }

    public int getBase(String msg, String err) {
        while (true) {
            System.out.print(msg);
            int base = Integer.parseInt(sc.nextLine());
            if (base == 2 || base == 10 || base == 16) {
                return base;
            }
            System.out.println(err);
        }
    }

    //take the input value by base
    public String getInputValue(int base) {
        System.out.println("Enter number: ");
        while (true) {
            String value = sc.nextLine();
            switch (base) {
                case 2:
                    if (value.matches("[0-1]+")) {
                        return formatNumber(value);
                    }
                    break;
                case 10:
                    if (value.matches("[0-9]+")) {
                        return formatNumber(value);
                    }
                    break;
                case 16:
                    if (value.matches("[0-9a-fA-F]+")) {
                        return formatNumber(value);
                    }
                    break;
            }
            System.out.println("Invalid type, please input again: ");
        }
    }

}
