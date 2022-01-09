package IntermediatePractice.Polymorphism.Player;

public class Swimmer extends Athlete implements Swimming {

    private int finaPoints;
    public Swimmer(String name, String nickName, int yearOfBorn, String team, int gamesPlayed, int finaPoints) {
        super(name, nickName, yearOfBorn, team, gamesPlayed);
        this.finaPoints = finaPoints;
    }

    @Override
    public String getBodyType() {
        return "lean Muscle long torso and flexible ankles";
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Fine Point: " + finaPoints);
    }

    @Override
    public void feestyle() {
        System.out.println("Swimming freestyle very fast. ");
    }

    @Override
    public void freestyle(int distance) {
        System.out.println("Swimming : "  + distance + "M freestle very fast");
    }

    @Override
    public void compete() {
        super.compete();
        feestyle();
    }
}
