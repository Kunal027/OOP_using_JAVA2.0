package IntermediatePractice.Encapsulation.Player;

import java.util.Random;

public class BaketballPlayer extends Athlete {

    double freeDrawPercentage;
    double pointsPerGame;


    public BaketballPlayer(String name, String nickName, int yearOfBorn, String team, double freeDrawPercentage, double pointsPerGame, int gamesPlayed) {
        super(name, nickName, yearOfBorn, team, gamesPlayed);
        this.freeDrawPercentage = freeDrawPercentage;
        this.pointsPerGame = pointsPerGame;

    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        if((randomNumberGenerator.nextDouble() * 100) > freeDrawPercentage) {
            System.out.println(super.getName()+ " Failed to score free draw");
        }
        else
            System.out.println(super.getName() + " Scored a free draw");
        }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Free through percentage : " + freeDrawPercentage);
        System.out.println("points per game : " + pointsPerGame);
    }

    @Override
    public void playGame() {
        super.playGame();
        freeThrow();
    }

    public void setFreeDrawPercentage(double freeDrawPercentage) {
        this.freeDrawPercentage = freeDrawPercentage;
    }

    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public void freeDrawPercentage(double v) {
    }
}


