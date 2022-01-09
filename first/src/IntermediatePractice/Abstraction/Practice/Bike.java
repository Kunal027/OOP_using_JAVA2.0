package IntermediatePractice.Abstraction.Practice;

import java.util.Random;

public class Bike {

    String name;
    private String manufacturer;
    short cubicCentimeter;
    long registrationNumber;
    short seatingCapacity;
    int bhp;
    int torque;

    public Bike(String name, String manufacturer, short cubicCentimeter, long registrationNumber, int bhp, int torque) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.cubicCentimeter = cubicCentimeter;
        Random registrationNumberGenerator = new Random();
        this.registrationNumber = registrationNumberGenerator.nextLong();
        this.seatingCapacity = seatingCapacity;
        this.bhp = bhp;
        this.torque = torque;
    }


    public  void getDescription(){
        System.out.println("Name of the bike is : "  + name);
        System.out.println("bike is manufactured by : " + manufacturer);
        System.out.println("CC of the bike is : " + cubicCentimeter);
        System.out.println("Registration Number : " + registrationNumber);
        System.out.println("Seating Capacity : " + seatingCapacity);
        System.out.println("BHP : " + bhp);
        System.out.println("Torque : " + torque);
        System.out.println("============================================================");
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return manufacturer;
    }
}
