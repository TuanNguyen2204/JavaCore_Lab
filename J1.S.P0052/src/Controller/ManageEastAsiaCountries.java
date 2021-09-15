package Controller;

import Model.EastAsiaCountries;
import java.util.ArrayList;
import java.util.Collections;

public class ManageEastAsiaCountries {

    Validation Validation = new Validation();

    public ManageEastAsiaCountries(ArrayList<EastAsiaCountries> listAsianCountries) {
        listAsianCountries.add(new EastAsiaCountries("VN", "Viet Nam", 5000, "Nice"));
        listAsianCountries.add(new EastAsiaCountries("SG", "Singapore", 5000, "Nice"));
    }

    public void menu() {
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order");
        System.out.println("5. Exit ");
        System.out.println("==========================================================================");
    }

    /**
     * Require user input information of country and check the country already
     * exist or does not exist
     * <p>
     * if country exist print out "The country exist" else will add show country
     * user just input and add to the list of country
     *
     * @param listAsianCountries <i>list of Asian countries store countries
     * input from user<i>
     */
    public void addCountryInformation(ArrayList<EastAsiaCountries> listAsianCountries) {

        String countryCode = Validation.checkInputString("Enter code of country: ");
        String countryName = Validation.checkInputString("Enter name country: ");
        float totalArea = Validation.checkTotalArea("Enter total area: ");
        String terrain = Validation.checkInputString("Enter terrain of country: ");

        if (Validation.checkCountryExistByID(listAsianCountries, countryCode)) {
            System.err.println("The country exist.");
        } else {
            EastAsiaCountries newCountry = new EastAsiaCountries(countryCode, countryName, totalArea, terrain);
            System.out.format("%-10s%-15s%-15s%s\n", "ID", "Name", "Total Area", "Terrain");
            newCountry.display();
            listAsianCountries.add(newCountry);
            System.out.println("The country has been added.");
        }

    }

    /**
     * Show for user all of country in list of Asian countries
     *
     * @param listAsianCountries <i>list of Asian countries store countries
     * input from user<i>
     */
    public void getRecentlyEnteredInformation(ArrayList<EastAsiaCountries> listAsianCountries) {
        if (listAsianCountries.isEmpty()) {
            System.err.println("User has not input any country.");
            return;
        }
        System.out.format("%-10s%-15s%-15s%s\n", "ID", "Name", "Total Area", "Terrain");
        for (EastAsiaCountries cty : listAsianCountries) {
            cty.display();
        }
    }

    /**
     * Require user input the name of country and method will show country for
     * user if it exist
     *
     * @param listAsianCountries <i>list of Asian countries store countries
     * input from user<i>
     */
    public void searchInformationByName(ArrayList<EastAsiaCountries> listAsianCountries) {
        if (listAsianCountries.isEmpty()) {
            System.out.println("User has not input any country.");
            return;
        }
        String countryName = Validation.checkInputString("Enter name country: ");
        if (Validation.checkCountryExistByName(listAsianCountries, countryName)) {
            System.out.format("%-10s%-15s%-15s%s\n", "ID", "Name", "Total Area", "Terrain");
            for (EastAsiaCountries cty : listAsianCountries) {
                if (cty.getCountryName().equalsIgnoreCase(countryName)) {
                    cty.display();
                }
            }
        } else {
            System.out.println("Not country named " + countryName);
        }
    }

    /**
     * Sort all countries in list of country
     * <p>
     * Show for user all of country in list of Asian countries
     *
     * @param listAsianCountries <i>list of Asian countries store countries
     * input from user<i>
     */
    public void sortInformationByAscendingOrder(ArrayList<EastAsiaCountries> listAsianCountries) {
        if (listAsianCountries.isEmpty()) {
            System.out.println("User has not input any country.");
            return;
        }
        System.out.format("%-10s%-15s%-15s%s\n", "ID", "Name", "Total Area", "Terrain");
        Collections.sort(listAsianCountries);
        for (EastAsiaCountries cty : listAsianCountries) {
            cty.display();
        }
    }
}
