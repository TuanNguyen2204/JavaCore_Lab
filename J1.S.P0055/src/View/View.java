package View;

import Controller.ManageDoctor;
import Controller.Validate;

public class view {

    ManageDoctor manage = new ManageDoctor();
    Validate validate = new Validate();

    public void menu() {
        int choice;
        while (true) {
            System.out.println("========Doctor Management========");
            System.out.println("1. Add Doctor");
            System.out.println("2. Update Doctor");
            System.out.println("3. Delete Doctor");
            System.out.println("4. Search Doctor");
            System.out.println("5. Show Doctor List");
            System.out.println("6. Exit");
            System.out.println("=================================\n");

            System.out.print("Choose a option : ");
            choice = validate.getIntLimit(1, 6);

            switch (choice) {
                case 1: {
                    System.out.println("---------Add---------");
                    manage.addDoctor();
                    break;
                }
                case 2: {
                    System.out.println("---------Update---------");
                    manage.updateDoctor();
                    break;
                }
                case 3: {
                    System.out.println("---------Delete---------");
                    manage.deleteDoctor();
                    break;
                }
                case 4: {
                    System.out.println("---------Search---------");
                    manage.searchDoctor();
                    break;
                }
                case 5: {
                    System.out.println("---------Doctor List---------");
                    manage.displayDoctorList();
                    break;
                }
                case 6:
                    return;
            }
        }
    }
}
