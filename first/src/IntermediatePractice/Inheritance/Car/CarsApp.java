package IntermediatePractice.Inheritance.Car;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("Red", (byte)1, (short) 392,
                (short) 492, (short) 6700, 3000, 1000, true);
        redDodgeChallenger.startTheEngine();
        redDodgeChallenger.getDescription();
        System.out.println(redDodgeChallenger.registrationNumber);


        System.out.println("---------------------------");

        ToyotaSupra blackToyotaSupra = new ToyotaSupra("Black", (byte)1, (short) 392,
                (short) 492, (short) 6700, 300, 100, false);
        blackToyotaSupra.startTheEngine();
        blackToyotaSupra.getDescription();
        System.out.println(blackToyotaSupra.registrationNumber);
    }
    }

