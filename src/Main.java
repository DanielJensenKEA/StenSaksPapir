public class Main {
    public static void main(String[] args) {
        try {
            HumanPlayer hp = new HumanPlayer("Daniel", 0);
            ComputerPlayer cp = new ComputerPlayer("David(ai)", 0);

            Game ng = new Game(hp, cp);
        } catch (Exception e) {
            System.out.println("An error has occurred. "+e+" "+e.getMessage());
        }

    }
}
