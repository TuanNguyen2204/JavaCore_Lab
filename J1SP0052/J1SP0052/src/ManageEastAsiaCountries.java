
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ManageEastAsiaCountries {
    private ArrayList<EastAsiaCountries> countryList;
    EastAsiaCountries countryLastEnter;

    ManageEastAsiaCountries(ArrayList<EastAsiaCountries> countryList) {
        this.countryList = countryList; //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<EastAsiaCountries> getCountryList() {
        return countryList;
    }

   
    public void addCountryInformation(EastAsiaCountries country){
        countryLastEnter = country;
        countryList.add(countryLastEnter);
    }
    
    
    public EastAsiaCountries getRecentlyEnteredInformation() {
        
        return countryLastEnter;
    }
    
     
    public void searchInformationByName(String name){    
        for (EastAsiaCountries country : countryList) {
            if(country.getCountryName().contains(name)){
                country.display();
            
            }
        }
    }
     
    public void sortInformationByAscendingOrder(){
        Collections.sort(countryList, new Comparator<EastAsiaCountries>(){
            @Override
            public int compare(EastAsiaCountries o1, EastAsiaCountries o2) {
                return o1.getCountryName().compareToIgnoreCase(o2.getCountryName()); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        display();
    }
    public void display(){
        for (EastAsiaCountries country : countryList) {
            country.display();;
        }
    }
    public boolean nameExist(String name){
        for (EastAsiaCountries country: countryList) {
            if(country.getCountryName().contains(name))
                return true;
        }
        return false;
    }

    
    
    
}

