package Intermediate.Encaptulation.Practice;

public class BikeApp {
    public static void main(String[] args) {

        YamahaFZS fzs = new YamahaFZS( "Yamaha", (short) 153, (short) 2,20,43);
        YamahaFZS apache = new YamahaFZS("TVS", (short) 310, (short) 2,
                20,  43);
        fzs.setManufacturer("Yamaha India");
        apache.setManufacturer("TVS India");

        fzs.getDescription();
        apache.getDescription();
        fzs.getManufacturer();
        apache.getManufacturer();


    }
}
