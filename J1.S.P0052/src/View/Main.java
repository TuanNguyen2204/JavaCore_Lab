package View;

import Model.EastAsiaCountries;
import Controller.*;
import java.util.ArrayList;

/**
 * Main class of program contain listAsianCountries
 *
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<EastAsiaCountries> listAsianCountries = new ArrayList<>();
        ManageEastAsiaCountries Manager = new ManageEastAsiaCountries(listAsianCountries);

        System.out.println("\t\t\t\tMENU\n"
                + "==========================================================================");
        Manager.menu();
        while (true) {
            int choice = new Validation().checkInputChoice("\nEnter your choice: ", 1, 5);
            switch (choice) {
                case 1:
                    Manager.addCountryInformation(listAsianCountries);
                    break;
                case 2:
                    Manager.getRecentlyEnteredInformation(listAsianCountries);
                    break;
                case 3:
                    Manager.searchInformationByName(listAsianCountries);
                    break;
                case 4:
                    Manager.sortInformationByAscendingOrder(listAsianCountries);
                    break;
                case 5:
                    System.out.println("==================================================================================================================================================================");
                    break;
            }
        }

    }
}
