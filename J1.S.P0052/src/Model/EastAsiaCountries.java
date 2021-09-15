package Model;

import java.util.Comparator;

public class EastAsiaCountries extends Country implements Comparable<EastAsiaCountries> {

    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public int compareTo(EastAsiaCountries o) {
        return super.getCountryName().compareToIgnoreCase(o.countryName);
    }

    @Override
    public void display() {
        super.display();
        System.out.format("%-10s\n", countryTerrain);
    }
}
