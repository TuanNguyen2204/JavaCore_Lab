
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Validate v = new Validate();

        Date date = v.getDate("Please enter date with format [dd/mm/yyyy]: ");
        System.out.println("Your day is " + v.DayOfWeek(date));

    }
}
