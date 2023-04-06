package Intermediate.statickeyword;

public class Country {

    private static int numberOfCounteries;
    private  final String NAME;
    private int population;
    private String capital;

    public Country(String name, int population, String capital) {
        NAME = name;
        this.population = population;
        this.capital = capital;
        numberOfCounteries++;
    }
    /*
    public void setName(String name){
        NAME =name;
    }
     */

    public final void populationChange(int change){
        population+=change;
    }

    public void getDetails(){
        System.out.println("Country name: " + NAME + " Population: " + population + " Capital: "+ capital);
    }

    public static int getNumberOfCounteries() {
        return numberOfCounteries;
    }
}
