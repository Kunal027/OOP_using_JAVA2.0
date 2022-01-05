package Intermediate.ClassesAndOBjects;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger dodgeChallenger = new DodgeChallenger();
        dodgeChallenger.startTheEngine();
        dodgeChallenger.getDescription();

        System.out.println("---------------------------");

        DodgeChallenger anotherDodgeChallenger = new DodgeChallenger();
        anotherDodgeChallenger.startTheEngine();
        anotherDodgeChallenger.getDescription();
    }
}
