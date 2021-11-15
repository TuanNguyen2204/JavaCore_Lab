
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ManageEastAsiaCountries {
    ArrayList<EastAsiaCountries> countryList;
    EastAsiaCountries lastCountryInput;

    ManageEastAsiaCountries(ArrayList<EastAsiaCountries> countryList) {
        this.countryList = countryList;
    }

    public ArrayList<EastAsiaCountries> getCountryList() {
        return countryList;
    }

   //case1
    public void addCountryInformation(EastAsiaCountries country){
        lastCountryInput = country;
        countryList.add(lastCountryInput);
    }
    
    //case2
    // Display information of countries you’ve just input
    public EastAsiaCountries getRecentlyEnteredInformation() {      
        return lastCountryInput;
    }
    
    //check countrycode is exist or not
    public boolean checkCountryExists(String countryCode) {
        for (EastAsiaCountries country : countryList) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return false;
            }
        }
        return true;
    }
    
     //case3
    public void searchInformationByName(String name){    
        for (EastAsiaCountries country : countryList) {
            if(country.getCountryName().toLowerCase().contains(name.toLowerCase())){
                country.display();          
            }
        }
    }
     
    //case4
    //sort by name
    public void sortInformationByAscendingOrder(){
        Collections.sort(countryList, new Comparator<EastAsiaCountries>(){
            @Override
            public int compare(EastAsiaCountries o1, EastAsiaCountries o2) {
                return o1.getCountryName().compareToIgnoreCase(o2.getCountryName()); 
            }
        });
        for (EastAsiaCountries country : countryList) {
            country.display();
        }
    }
    
    public boolean nameIsExist(String name){
        for (EastAsiaCountries country: countryList) {
            if(country.getCountryName().contains(name))
                return true;
        }
        return false;
    }

    
    
    
}

