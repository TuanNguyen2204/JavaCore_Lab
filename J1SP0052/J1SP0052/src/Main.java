
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args){
        ArrayList<EastAsiaCountries> countryList = new ArrayList<>();
        countryList.add(new EastAsiaCountries("VN", "Viet Nam", 100000, "Nice"));
//        countryList.add(new EastAsiaCountries("PHI", "Philippines", 300000, "Good"));
//        countryList.add(new EastAsiaCountries("IND", "Indonesia", 2300000, "Pretty"));
//        countryList.add(new EastAsiaCountries("MAS", "Malaysia", 170000, "Not bad"));
        ManageEastAsiaCountries mn = new ManageEastAsiaCountries(countryList);
        View v = new View(mn);
        while(true){
            System.out.println("--------- MENU ---------");
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of country you've just input");
            System.out.println("3. Search the information of country by user-entered name");
            System.out.println("4. Display the information of countries sorted name in ascending order");        
            System.out.println("5. Exit");
            
            int choice = Validation.inputInt("Enter your choice: ");
            switch(choice){
                case 1:
                    v.addCountryInformation();
                    break;
                case 2:
                    v.getRecentlyEnteredInformation();
                    break;
                case 3:
            {
                String name = null;
                v.searchInformationByName(name);
            }
                    break;
                case 4:
                    v.sortInformationByAscendingOrder();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You must choose from 1 to 5! Enter again.");
            }
        }
    }
    
}