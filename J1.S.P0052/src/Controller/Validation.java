package Controller;

import Model.EastAsiaCountries;
import java.util.ArrayList;
import java.util.Scanner;
    
public class Validation {
    
    private final static Scanner sc = new Scanner(System.in);
    
    /**
     *  check and return String not empty!
     * @param  message String send to user
     * @return String not empty
     */
    public String checkInputString(String message) {
        while (true) {
            System.out.print(message);
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not Empty!");
            } else {
                return result;
            }
        }
    }
    
    /**
     *  check user choice number from min to max
     * @param message String send to user
     * @param min int minimum number of choices
     * @param int max maximum number of choices
     * @return int - choice of user
     */
    public int checkInputChoice(String message, int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(checkInputString(message));
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
            }
        }
    }
    
    /**
     * check and return total of area must be number and greater than 0
     * @param String message send to user
     * @return float number total area
     */
    public float checkTotalArea(String message){
        while(true){
            try {
                float totalArea = Float.parseFloat(checkInputString(message));
                if (totalArea<=0) {
                    System.err.println("Total area must be greater than 0.");
                    continue;
                }
                return totalArea;
            } catch (Exception e) {
                System.err.println("Invalid total area.");
                continue;
            }
        }
    }
    
    /**
     * check country code exist or not in list countries user already input
     * @param listCountries list of countries contain countries user already add
     * @param Code String code of country user want to check
     * @return country already exist return true, does not exist return false
     */
    public boolean checkCountryExistByID(ArrayList<EastAsiaCountries> listCountries, String Code){
        for(EastAsiaCountries cty: listCountries){
            if (cty.getCountryCode().equalsIgnoreCase(Code)) return true;
        }
        return false;
    }
    
    /**
     * check country name exist or not in list countries user already input
     * @param listCountries list of countries contain countries user already add
     * @param Name String name of country user want to check
     * @return country already exist return true, does not exist return false
     */
    public boolean checkCountryExistByName(ArrayList<EastAsiaCountries> listCountries, String Name){
        for(EastAsiaCountries cty: listCountries){
            if (cty.getCountryName().equalsIgnoreCase(Name)) return true;
        }
        return false;
    }
    
}
