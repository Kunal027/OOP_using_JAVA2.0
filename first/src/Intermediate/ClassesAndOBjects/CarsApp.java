package Intermediate.ClassesAndOBjects;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte)1, (short) 392,
                (short) 492, (short) 6700, 3000, 1000, true);
        redDodgeChallenger.startTheEngine();
        redDodgeChallenger.getDescription();
        System.out.println(redDodgeChallenger.registrationNumber);


        System.out.println("---------------------------");

        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange", (byte)1, (short) 392,
                (short) 492, (short) 6700, 3000, 10000, false );
        orangeDodgeChallenger.startTheEngine();
        orangeDodgeChallenger.getDescription();
        System.out.println(orangeDodgeChallenger.registrationNumber);
    }
    }

