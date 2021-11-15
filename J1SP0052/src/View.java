
import java.util.ArrayList;

public class View {

    ManageEastAsiaCountries m;
    private ArrayList<EastAsiaCountries> countryList;

    Validation v = new Validation();


    public View(ManageEastAsiaCountries m, ArrayList<EastAsiaCountries> countryList) {
        this.m = m;
        this.countryList = countryList;
    }

    public void addCountryInformation() {
        System.out.println("Enter code of country: ");
        String countryCode = v.checkInputString();
        if (!m.checkCountryExists(countryCode)) {
            System.out.println("Country exist.");
            return;
        }

        System.out.println("Enter name of country: ");
        String countryName = v.checkInputString();
        countryName = v.normalize(countryName);

        System.out.println("Enter total Area: ");
        float totalArea = v.checkInputFloat(0);

        System.out.println("Enter terrain of country: ");
        String countryTerrain = v.checkInputString();
        EastAsiaCountries country;
        country = new EastAsiaCountries(countryCode, countryName, totalArea, countryTerrain);
        m.addCountryInformation(country);

    }

    public void getRecentlyEnteredInformation() {
        if (m.getCountryList().isEmpty()) {
            System.out.println("List empty! Not yet input data.");
        } else {
            System.out.format("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
            m.getRecentlyEnteredInformation().display();
        }
    }

    public void searchInformationByName(String name) {
        if (m.getCountryList().isEmpty()) {
            System.out.println("List empty!");
        } else {
            System.out.println("Enter the name you want to search for: ");
            name = v.checkInputString();
            name = v.normalize(name);
            if (m.nameIsExist(name)) {
                System.out.format("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
                m.searchInformationByName(name);
            } else {
                System.out.println("Not found!");
            }
        }
    }

    public void sortInformationByAscendingOrder() {
        System.out.format("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
        m.sortInformationByAscendingOrder();
    }
}
