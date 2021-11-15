 
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        EmployeeManager m = new EmployeeManager();
        Validate v = new Validate();
        int choose;
                
        m.add();
        while(true){
            
            m.menu();
            choose = v.getChoice(1, 6);
            switch(choose){
                case 1:
                    m.addEmployee();
                    break;
                case 2:
                    m.updateEmployee();
                    break;
                case 3:
                    m.removeEmployee();
                    break;
                case 4:
                    m.searchEmployee();
                    break;
                case 5:
                    m.sortEmployee();
                    break;
                case 6:
                    return;
            }
        }
    }
}

