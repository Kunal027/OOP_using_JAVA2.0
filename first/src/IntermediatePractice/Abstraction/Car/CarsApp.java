package IntermediatePractice.Abstraction.Car;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("Red", (byte)1, (short) 392,
                (short) 492, (short) 6700, 3000, 1000, true);
        System.out.println("the car is in city mode");
        redDodgeChallenger.startTheElectricEngine();
        System.out.println(redDodgeChallenger.getCarName() + "'s Price: $ " + redDodgeChallenger.getPrice());
        redDodgeChallenger.setPrice(35000);
        System.out.println(redDodgeChallenger.getCarName() + "'s New Price: $ " + redDodgeChallenger.getPrice());
        System.out.println(redDodgeChallenger.registrationNumber);
        System.out.println("The car has " + redDodgeChallenger.getMileage() + " Kms");
        redDodgeChallenger.drive(100);
        System.out.println("After driving the car it has " + redDodgeChallenger.getMileage() + " Kms");


        System.out.println("---------------------------");

        ToyotaSupra blackToyotaSupra = new ToyotaSupra("Black", (byte)1, (short) 392,
                (short) 492, (short) 6700, 300, 100, false);

        blackToyotaSupra.startTheEngine();
        System.out.println(blackToyotaSupra.getCarName() + "'s Price: $ " + blackToyotaSupra.getPrice());
        blackToyotaSupra.setPrice(30000);
        System.out.println(blackToyotaSupra.getCarName() + "'s New Price: $ " + blackToyotaSupra.getPrice());
        System.out.println(blackToyotaSupra.registrationNumber);
        System.out.println("The car has " + blackToyotaSupra.getMileage() + " Kms");
        blackToyotaSupra.drive(200);
        System.out.println("After driving the car it has " + blackToyotaSupra.getMileage() + " Kms");


    }
    }

