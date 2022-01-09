package IntermediatePractice.Inheritance.Practice;

public class BikeApp {
    public static void main(String[] args) {

        YamahaFZS fzs = new YamahaFZS((String) "Yamaha", (short) 153, (short) 2,20,43);
        YamahaFZS apache = new YamahaFZS((String) "TVS", (short) 310, (short) 2,
                20,  43);

        fzs.getDescription();
        apache.getDescription();

    }
}
