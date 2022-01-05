package Intermediate.ClassesAndOBjects;

public class DodgeChallenger {

    byte numberOfSeats = 5;
    byte numberOfDoors = 4;
    byte numberOfVehicleOwners = 1;
    byte emissionSticker = 4;

    short power = 362;
    short horsePower = 492;
    short co2Emission = 333;
    short cubicCapacity = 6417;

    int price = 29999;
    int mileage = 14999;

    long registrationNumber = 1216544515L;

    float fuelConsumptionCombined = 15.5F;
    float fuelConsumptionUrban = 21.4F;
    float fuelConsumptionExtraUrban = 13.6F;

    double fuelConsumptionPriceAverage = 153.1454498496468-1;

    boolean isDamaged = true;
    char energyEfficiency = 'G';

    public void  startTheEngine(){
        System.out.println("The Engine is started");
    }
     public void getDescription(){
         System.out.println("2018 Dodge Challenger SRT");
         System.out.println("price = $ " + price);
         System.out.println("Mileage : " + mileage);
         System.out.println("Is car is damaged : " + isDamaged);
         System.out.println("Registration Number : " + registrationNumber);
         System.out.println("Cubic Capacity : " + cubicCapacity);
         System.out.println("Horse Power " + horsePower + "hp");
         System.out.println("Co2 Emission : " + co2Emission + "g/km");
         System.out.println("Emission Sticker : " + emissionSticker + "(Energy efficiency : " + energyEfficiency + ")");
         System.out.println("Fuel Consumption Combined : " + fuelConsumptionCombined);
         System.out.println("Urban Fuel Consumption " + fuelConsumptionExtraUrban);
         System.out.println("precise average " + fuelConsumptionPriceAverage);
         System.out.println("Number of previous owners : " + numberOfVehicleOwners );
         System.out.println("Number of Doors " + numberOfDoors);
         System.out.println("Number of seats " + numberOfSeats);
     }
}
