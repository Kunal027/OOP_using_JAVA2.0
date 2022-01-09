package IntermediatePractice.StaticKeyword;

public class CountriesApp {
    public static void main(String[] args) {

        System.out.println("Number of countries : " + Country.getNumberOfCountries());
        Country brazil = new Country("Brazil", 210000,  "Brazilian");
        brazil.getDetails();
        Country germany = new Country("Germany", 8320000,  "Berlin");
        germany.getDetails();
        Country japan = new Country("Japan", 12520000,  "Tokyo");
        japan.getDetails();
        System.out.println("Number of Countries : " + Country.getNumberOfCountries());

    }
}
