
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Validation v = new Validation();
        ArrayList<EastAsiaCountries> countryList = new ArrayList<>();
        countryList.add(new EastAsiaCountries("THAI", "Thailand", 513120, "Nice"));
        countryList.add(new EastAsiaCountries("MYA", "Myanmar", 676578, "Nice"));
        countryList.add(new EastAsiaCountries("MALAY", "Malaysia", 330803, "Nice"));
        countryList.add(new EastAsiaCountries("INDO", "Indonesia", 1860360, "Nice"));
        countryList.add(new EastAsiaCountries("BRU", "Brunei", 5765, "Nice"));
        ManageEastAsiaCountries m = new ManageEastAsiaCountries(countryList);
        View vi = new View(m, countryList);
        while(true){
            System.out.println("--------- MENU ---------");
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of country you've just input");
            System.out.println("3. Search the information of country by user-entered name");
            System.out.println("4. Display the information of countries sorted name in ascending order");        
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = v.checkInputLimit(1, 5);
            switch(choice){
                case 1:
                    vi.addCountryInformation();
                    break;
                case 2:
                    vi.getRecentlyEnteredInformation();
                    break;
                case 3:
            {
                String name = null;
                vi.searchInformationByName(name);
            }
                    break;
                case 4:
                    vi.sortInformationByAscendingOrder();
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