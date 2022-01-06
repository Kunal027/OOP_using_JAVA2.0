package Intermediate.Inheritance.Player;

public class AthleteApp {
    public static void main(String[] args) {
        //player 1
        BaketballPlayer kobe = new BaketballPlayer("Kobe Brayden", "Black Mamba", 1978,
                "Lakers", 83.7, 25.0, 13);
        //player 2
        BaketballPlayer jordan = new BaketballPlayer("Michael Jordan ", "MJ", 1963,
                "Chicago Bulls", 83.5, 25.0, 1072);
        //player 3
        BaketballPlayer magic = new BaketballPlayer("Earvin Johnson", "Magic", 1959,
                "Lakers", 84.8, 19.05, 906);

        BaketballPlayer[] basketballPlayers = new BaketballPlayer[3];
        basketballPlayers[0] = kobe;
        basketballPlayers[1] = jordan;
        basketballPlayers[2] = magic;

       for(BaketballPlayer basketballPlayer : basketballPlayers){
           System.out.println("===============================================");
           basketballPlayer.getBio();
       }

       FootballPlayer ronaldo = new FootballPlayer("Christiano Ronaldo","Ronaldo", 1977,
               "Manchester United", 900,9584,89 );
       FootballPlayer messi = new FootballPlayer("Leonel Messi","GOAT", 1985,
               "Paris Saint Germans", 900,9554,90 );

       FootballPlayer[] footballPlayers = new FootballPlayer[2];
       footballPlayers[0] = ronaldo;
       footballPlayers[1] = messi;

       for (FootballPlayer footballPlayer : footballPlayers){
           System.out.println("======================================================");
           footballPlayer.getBio();
       }

    }
}
