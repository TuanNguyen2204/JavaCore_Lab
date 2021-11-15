
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
public class View {
    ManageEastAsiaCountries mn;
    
   
    public View(ManageEastAsiaCountries mn) {
        this.mn = mn; //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
    
    public void addCountryInformation(){
        
        String countryCode = Validation.inputName("Enter code of country: ");
        countryCode = countryCode.replaceAll("\\s+", " ").trim();
        String countryName = Validation.inputName("Enter name of country: ");
        float totalArea = Validation.inputFloat("Enter total Area: ");
        String countryTerrain = Validation.inputName("Enter terrain of country: ");
        countryTerrain = countryTerrain.replaceAll("\\s+", " ").trim();
         
        EastAsiaCountries country;
        country = new EastAsiaCountries(countryCode, countryName, totalArea, countryTerrain);
        mn.addCountryInformation(country);
       
       
      
    }
    
    public void getRecentlyEnteredInformation(){
        if(mn.getCountryList().isEmpty()){
            System.err.println("List empty! You must add country first.");
            return;
        }
        System.out.format("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
        mn.getRecentlyEnteredInformation().display();
      
      
       
   
    
    }
    public void searchInformationByName(String name){
        name = Validation.inputName("Enter the name you want to search for: ");
        if(mn.nameExist(name)){
            
            System.out.format("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
            mn.searchInformationByName(name);
        }else{
        
            System.out.println("Not found!");
       
        }
        
    }         
     
    public void sortInformationByAscendingOrder(){
        System.out.format("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
        mn.sortInformationByAscendingOrder();
    }
}
