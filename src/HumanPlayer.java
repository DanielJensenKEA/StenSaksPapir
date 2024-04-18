import java.util.*;

public class HumanPlayer extends Player {

    public HumanPlayer(String name, int points) {
        super(name, points);
    }

    @Override
    public RPS returnGesture() {
        Scanner sc = new Scanner(System.in);
        RPS result = null;

        do { //Do while loop logik lånt fra tidligere løst opgave i Filmsamling 2.0
            System.out.print(">");
            String input = sc.nextLine();
            if (input.equals("rock") || input.equals("paper") || input.equals("scissors") || input.equals("scissor")) {
                if (input.equals("scissor")) { //Singular instead of the coded plural
                    result = RPS.SCISSORS;
                } else {
                   result = RPS.valueOf(input.toUpperCase());
                }
            } else {
                System.out.println("Please only type rock, paper or scissors.");
            }
        } while (result == null);
        return result;
    }
}
