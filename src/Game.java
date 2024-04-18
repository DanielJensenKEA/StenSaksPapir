public class Game {

    private HumanPlayer hp;
    private ComputerPlayer ComputerPlayer;

    public Game(HumanPlayer hp, ComputerPlayer ComputerPlayer) {
        this.hp = hp;
        this.ComputerPlayer = ComputerPlayer;
        start();

    }

    private void start() {
        int rounds = 0;
        int roundsDisplay = 0;
        int MAXROUNDS = 3;
        boolean introFlag = true;


        while (rounds != MAXROUNDS) {
            if (introFlag) {
                System.out.println("Welcome to Rock, Paper, Scissors. ");
                System.out.println("The game will run for three rounds unless the players" +
                        " are in a stalemate.");
                System.out.println("Please type rock, paper or scissors to play the game.");
                introFlag = false;
            } else {
                System.out.println("This game has run for " + roundsDisplay + " rounds.");
            }

                RPS playerResultVar = hp.returnGesture();
                RPS ComputerResultVar = ComputerPlayer.returnGesture();

                if (playerResultVar == RPS.ROCK && ComputerResultVar == RPS.PAPER) {
                    ComputerPlayer.setPoints(ComputerPlayer.countPoints());
                } else if (playerResultVar == RPS.PAPER && ComputerResultVar == RPS.ROCK) {
                    hp.setPoints(hp.countPoints());
                } else if (playerResultVar == RPS.SCISSORS && ComputerResultVar == RPS.PAPER) {
                    hp.setPoints(hp.countPoints());
                } else if (playerResultVar == RPS.PAPER && ComputerResultVar == RPS.SCISSORS) {
                    ComputerPlayer.setPoints(ComputerPlayer.countPoints());
                } else if (playerResultVar == RPS.ROCK && ComputerResultVar == RPS.SCISSORS) {
                    hp.setPoints(hp.countPoints());
                } else if (playerResultVar == RPS.SCISSORS && ComputerResultVar == RPS.ROCK) {
                    ComputerPlayer.setPoints(ComputerPlayer.getPoints());
                } else {
                    System.out.print("");
                }
                System.out.println(hp.getName() + " gesture: ");
                System.out.println(playerResultVar);
                System.out.println(" ");
                System.out.println(ComputerPlayer.getName() + " gesture: ");
                System.out.println(ComputerResultVar);
                System.out.println(" ");


                //if(hp.getPoints() == ComputerPlayer.getPoints()) {
                if (playerResultVar == ComputerResultVar) {
                    roundsDisplay++;
                    System.out.println("No points awarded. Game will progress past three rounds.");
                    System.out.println("The points remain the same.");
                    System.out.println("Player points: " + hp.getPoints() + "\tComputer Points: " + ComputerPlayer.getPoints());

                } else {
                    roundsDisplay++;
                    rounds++;
                    System.out.println("The point distribution is as follows: ");
                    System.out.println("Player points: " + hp.getPoints());
                    System.out.println("Computer points: " + ComputerPlayer.getPoints());
                    System.out.println("Round count up! \n");
                }
            }
            System.out.println("\t------WINNER------");
            if (hp.getPoints() > ComputerPlayer.getPoints()) {
                System.out.println(hp.getName() + " with points total to: " + hp.getPoints());
                System.out.println("The game went for " + roundsDisplay + " amount of rounds.");
            } else {
                System.out.println(ComputerPlayer.getName() + " with points total to: " + ComputerPlayer.getPoints());
                System.out.println("The game went for " + roundsDisplay + " amount of rounds.");
            }


    }

}
