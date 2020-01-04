public class Game {
    private int matches = 10;
    boolean running;

    public void runGame() {
        Computer opponent = new Computer("Computer");
        Human player = new Human("Human");
        running = true;


        System.out.println("Welcome to Nm");
        System.out.println("Player 1: Computer");
        System.out.println("Player 1: Human");

        while(running) {
            // Computers turn
            System.out.println("Remaining matches: " + matches);
            int computerRemovesMatch = opponent.drawMatches(matches);
            matches -= computerRemovesMatch;
            System.out.println(opponent.getName() + " removes " + computerRemovesMatch + " matches");

            // If computer wins
            if(matches <= 1) {
                System.out.println("Computer wins. You lose");
                break;
            }

            // Players turn
            System.out.println("Remaining matches: " + matches);
            System.out.println("Your move. There are " + matches + " matches..");
            int playerRemovesMatch = player.drawMatches(matches);
            matches -= playerRemovesMatch;
            System.out.println(player.getName() + " removes " + computerRemovesMatch + " matches");

            // If player wins
            if(matches <= 1) {
                System.out.println("You win. Computer loses");
                break;
            }
        }

    }

}
