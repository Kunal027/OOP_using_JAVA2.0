package IntermediatePractice.StaticKeyword;

public class Country {

    private static int numberOfCountries;
    private final String name;
    private int population;
    private String capital;

    static {
        numberOfCountries = 5;
    }

    static {
        numberOfCountries = 0;
    }


    public Country(String name, int population, String capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
        numberOfCountries ++;
    }

    public final void populationChange(int change){
        population += change;
    }
    public void getDetails(){
        System.out.println("Country Name: " + name + " || Population : " + population
                 + "|| Capital : " + capital);
        System.out.println("_____________________________________________________________");
    }

    public static int getNumberOfCountries() {
        return numberOfCountries;
    }
}
