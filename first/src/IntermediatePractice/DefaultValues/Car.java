package IntermediatePractice.DefaultValues;

public class Car {

    private byte numberOfSeats;
    private short horsePower;
    private int price;
    private long registrationNumber;

    private int fuelConsumption;
    private double preciseFuelConsumption;

    private boolean isDamaged;
    private char energyEfficiencyCategory;
    private String color;

    private Boolean hasElectricEngine;
    private Engine engine;

    public void getDetails(){
        System.out.println("Number of Seats : " + numberOfSeats);
        System.out.println("Horsepower : " + horsePower);
        System.out.println("Price : " + price);
        System.out.println(" Registration number : " + registrationNumber);
        System.out.println("Fuel Consumption : " + fuelConsumption);
        System.out.println("Is car is damaged : " + isDamaged);
        System.out.println("Energy efficiency category : " + energyEfficiencyCategory);
        System.out.println("Car's Color : " + color);
        System.out.println("The car has electric engine : " + hasElectricEngine);
        System.out.println("The engine this car has is : " + engine);
    }
}
