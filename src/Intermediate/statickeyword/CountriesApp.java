package Intermediate.statickeyword;

public class CountriesApp {
    public static void main(String[] args) {
        System.out.println("Number of countries: " + Country.getNumberOfCounteries());
        Country brazil = new Country("Brazil", 210_000_000, "Brasilia");
        brazil.getDetails();
        Country germany = new Country("Germany", 83_000_000, "Berlin");
        germany.getDetails();
        Country japan = new Country("Japan", 125_000_000, "Tokyo");
        japan.getDetails();
        System.out.println("Number of countries: " + Country.getNumberOfCounteries());
    }
}
