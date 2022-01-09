package IntermediatePractice.Inheritance.Player;

public class FootballPlayer extends Athlete{

    private int completion;
    private int passingYards;
    public FootballPlayer(String name, String nickName, int yearOfBorn, String team, int gamesPlayed,
                          int completion, int passingYards) {
        super(name, nickName, yearOfBorn, team, gamesPlayed);
        this.completion = completion;
        this.passingYards = passingYards;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Completions" + completion);
        System.out.println("Passing" + passingYards);
    }
}

