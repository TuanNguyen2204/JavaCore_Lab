
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Validate {

    Scanner sc = new Scanner(System.in);

    public Date getDate(String msg) {
        String regex = "\\d{1,2}[/]\\d{1,2}[/]\\d{4}";
        while (true) {
            try {
                SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
                sf.setLenient(false);
                System.out.print(msg);
                String input = sc.nextLine();
                if (input.matches(regex)) {

                    Date date = sf.parse(input);
                    return date;
                } else {
                    System.out.println("Date not exist");
                }
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                        catch (Exception e) {
                System.out.println("Date not exist");
            }
        }
    }

    public String DayOfWeek(Date getDate) {
        Calendar c = Calendar.getInstance();
        c.setTime(getDate);
        //ngày trong tuần được viết ra đủ kí tự
        String dayOfWeek = new SimpleDateFormat("EEEE").format(getDate);
        return dayOfWeek;
    }

}
