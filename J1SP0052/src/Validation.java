
import java.util.Scanner;

public class Validation {
    public static Scanner in = new Scanner(System.in);
    public int checkInputLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Enter number in range [ " + min + ", " + max + "]");
                System.out.print("Enter your choice again: ");
            }
        }
    }
    
    
    public float checkInputFloat(float min) {
        while (true) {
            try {
                float result = Float.parseFloat(in.nextLine().trim());
                if (result <= min) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (Exception e) {
                System.out.println("Area of country must be > 0.");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Is Empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //chuan hoa ten, country
    public String normalize(String input) {
        String[] temp = input.split("\\s+");
        int len = temp.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length - 1; i++) {
            sb.append(temp[i]);
            sb.append(" ");
        }
        sb.append(temp[len - 1]);
        sb = sb.replace(0, 1, (sb.charAt(0) + "").toUpperCase());
          return sb + "";
    }
}
    
