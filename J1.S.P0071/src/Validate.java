
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validate {

    Scanner sc = new Scanner(System.in);

    public int getInt(String msg, String err, int min, int max) {
        while (true) {
            try {
                int input;
                System.out.println(msg);
                input = Integer.parseInt(sc.nextLine());
                if (input < min || input > max) {
                    System.out.println(err);
                    continue;
                }
                return input;
            } catch (Exception ex) {
                System.out.println(err);
            }
        }
    }

    public String getInputString(String msg, String regex) {
        System.out.print(msg);
        String input;
        while (true) {
            input = sc.nextLine().trim();
            if (input.trim().isEmpty()) {
                System.out.println("Not empty!");
                System.out.print("Enter again: ");
                continue;
            }
            if (input.matches(regex)) {
                return input.trim();
            }
            System.out.println("Invalid input. Enter again: ");
        }
    }

    public String getDate(String msg, String err) {
        while (true) {
            try {
                SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print(msg);
                sf.setLenient(false);
                Date date = sf.parse(sc.nextLine());
                return sf.format(date);
            } catch (Exception e) {
                System.out.println(err);
            }
        }
    }

    public String getTaskType(String msg) {
        System.out.print(msg);
        int taskTypeID = getIntLimit(1, 4);
        String taskType = "";
        switch (taskTypeID) {
            case 1:
                taskType = "Code";
                break;
            case 2:
                taskType = "Test";
                break;
            case 3:
                taskType = "Design";
                break;
            case 4:
                taskType = "Review";
                break;
        }
        return taskType;
    }

    public double getTimePlan(String msg, String err, double min, double max) {
        double time = 0;
        do {
            System.out.println(msg);
            try {
                time = Double.parseDouble(sc.nextLine());
                if (time >= min && time <= max && (time * 10) % 5 == 0) {
                    break;
                }
                System.out.println(err);
            } catch (Exception e) {
                System.out.println(err);
            }
        } while (true);
        return time;
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
}
