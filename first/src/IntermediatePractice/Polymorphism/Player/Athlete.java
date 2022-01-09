package IntermediatePractice.Polymorphism.Player;

public abstract class Athlete {

    String name;
    String nickName;
    int yearOfBorn;
    String team;
    int numberOfCompletions;

    public Athlete(String name, String nickName, int yearOfBorn, String team, int gamesPlayed) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.numberOfCompletions = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public void getBio(){
        System.out.println(name + "(" + nickName + ")");
        System.out.println("Born in : " + yearOfBorn);
        System.out.println("Last team is : " + team + " and took part in : " + numberOfCompletions + "competitions");
    }

    public void compete(){
        System.out.println(name + " took part in a competition");
        numberOfCompletions++;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;

    }

    public abstract String getBodyType();
}
