import java.util.Random;

public class ComputerPlayer extends Player{
    int MAX = 3;
    Random rand = new Random();

    public ComputerPlayer(String name, int points) {
        super(name, points);
    }
    public RPS rollToFetchEnum() {
        int result = rand.nextInt(MAX); //Kode kan simplificeres til at stå på færre linjer, men beholder det sådan her læsbarhed.

        RPS rpsResult = RPS.values()[result];

        return rpsResult;
    }

    @Override
    public RPS returnGesture() {
        return rollToFetchEnum();
    }
}
