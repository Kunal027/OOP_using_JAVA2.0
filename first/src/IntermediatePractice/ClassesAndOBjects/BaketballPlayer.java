package IntermediatePractice.ClassesAndOBjects;

import java.util.Random;

public class BaketballPlayer {
    String name;
    String nickName;
    int yearOfBorn;
    String team;

    double freeDrawPercentage;
    double pointsPerGame;
    int gamesPlayed;

    public BaketballPlayer(String name, String nickName, int yearOfBorn, String team, double freeDrawPercentage, double pointsPerGame, int gamesPlayed) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.freeDrawPercentage = freeDrawPercentage;
        this.pointsPerGame = pointsPerGame;
        this.gamesPlayed = gamesPlayed;
    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        if((randomNumberGenerator.nextDouble() * 100) > freeDrawPercentage) {
            System.out.println(name + " Failed to score free draw");
        }
        else
            System.out.println(name + " Scored a free draw");
        }
    }
