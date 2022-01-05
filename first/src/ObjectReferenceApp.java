public class ObjectReferenceApp {
    public static void main(String[] args) {
        Byte numberOfSeats = 5;
        Short horsePower = 392;
        Integer price = 14999;
        Long regNumber = 211654685L;

        Float fuelConsumptionCombined = 15.5F;
        Double fuelConsumptionPrecise = 15.65118515418;

        Boolean isDamaged =  true;
        Character energyEfficiencyCategory = 'G';

        String carModel = "DodgeChallenger SRT 392";
        String carModelNew = new String("DodgeChallenger SRT 932");

        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Horse Power: " + horsePower);
        System.out.println("Price:" + price.floatValue());
        System.out.println("registration Number:" + regNumber);
        System.out.println("Fuel consumption: " + fuelConsumptionCombined);
        System.out.println("Precise fuel consumption: " + fuelConsumptionPrecise);
        System.out.println("Is Damaged: " + isDamaged);
        System.out.println("Energy Efficiency Category: " + energyEfficiencyCategory);
        System.out.println("car Model: " + carModel.equals(carModelNew));
        System.out.println("The car model with new keyword: " + carModelNew);


    }
}
