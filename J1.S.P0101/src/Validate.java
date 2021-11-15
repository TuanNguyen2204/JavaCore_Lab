
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Validate {

    public static Scanner sc = new Scanner(System.in);

    public String getString(String msg, String err, String regex) {
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println(err);
            }
        }
    }

    public int getChoice(int min, int max) {
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                if (input < min || input > max) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Please input number in range [" + min + "," + max + "]");
                System.out.print("Input choice: ");
            }
        }
    }

    public double getDouble(String msg, String err) {
        while (true) {
            try {
                System.out.print(msg);
                double num = Double.parseDouble(sc.nextLine());
                if (num < 0) {
                    System.out.println(err);
                    continue;
                }
                return num;
            } catch (Exception e) {
                System.out.println(err);
            }
        }
    }

    public String getDate(String msg) {
        String regex = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
        while (true) {
            try {
                SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
                sf.setLenient(false);
                System.out.print(msg);
                String input = sc.nextLine();
                if (input.matches(regex)) {

                    Date date = sf.parse(input);
                    return sf.format(date);
                } else {
                    System.out.println("Date not exist");
                }
            } catch (Exception e) {
                System.out.println("Date not exist");
            }
        }
    }

    public boolean checkAge(String sdob) throws ParseException {
        //convert String to Date
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sdob);
        //create calendar object for to day
        Calendar today = Calendar.getInstance();
        //create calendar object for dob
        Calendar dob = Calendar.getInstance();
        dob.setTime(date);
        if (dob.after(today)) {
            return false;
        }
        int year1 = today.get(Calendar.YEAR);
        int year2 = dob.get(Calendar.YEAR);
        //Tinh tuoi
        int age = year1 - year2;
        int month1 = today.get(Calendar.MONTH);
        int month2 = dob.get(Calendar.MONTH);
        //check thang
        if (month2 > month1) {
            age--;         
        } else if (month1 == month2) {
            //check ngay
            int day1 = today.get(Calendar.DAY_OF_MONTH);
            int day2 = dob.get(Calendar.DAY_OF_MONTH);
            if (day2 > day1) {
                age--;
            }
        }
        if (age < 18 || age > 55) {
            return false;
        } else {
            return true;
        }
    }

    public String checkYN() {
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (!(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n"))) {
                    throw new NumberFormatException();
                } else {
                    return input;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be Y or N");
                System.out.print("Enter again: ");
            }
        }
    }
}
