package Intermediate.encapsulation.athlete;

public class AthleteApp {
    public static void main(String[] args) {
        BasketballPlayer kobe = new BasketballPlayer("Kobe Bryant", "Black Mamba", 1978, "Lakers", 83.7, 25.0, 1346);
        BasketballPlayer jordan = new BasketballPlayer("Michael Jordan", "MJ", 1963, "Chicago Bulls", 83.5, 30.1, 1746);
        BasketballPlayer magic = new BasketballPlayer("Michael Jordan", "Magic", 1963, "Lakers", 84.8, 19.5, 986);

        kobe.setFreeThrowPercentage(83.8);
        kobe.setPointsPerGame(27);

        BasketballPlayer[] basketballPlayers = new BasketballPlayer[3];
        basketballPlayers[0]= kobe;
        basketballPlayers[1]= jordan;
        basketballPlayers[2]=magic;

        for(BasketballPlayer basketballPlayer : basketballPlayers){
            System.out.println("-------------------------------------------------");
            basketballPlayer.freeThrow();
            basketballPlayer.getBio();
            basketballPlayer.playGame();

        }

        FootballPlayer tom = new FootballPlayer("Tom Brady", "Tom Terrific", 1977, "Tampa Bay", 285, 9988, 6377);
        FootballPlayer ed = new FootballPlayer("Ed Brady", "Ed Terrific", 1979, "New England Patriots", 155, 6958, 4327);
        ed.setTeam("Tampa Bay");
        FootballPlayer[] footballPlayers = new FootballPlayer[2];
        footballPlayers[0] = tom;
        footballPlayers[1] = ed;

        for(FootballPlayer footballPlayer : footballPlayers){
            System.out.println("---------------------------------------------");
            footballPlayer.getBio();
            footballPlayer.playGame();
            footballPlayer.increaseCompletions(41);

        }

    }
}
