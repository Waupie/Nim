import java.util.Random;

public class Computer extends Player {

    public Computer(String name) {
        super(name);
    }

    @Override
    int drawMatches(int matches) {
        Random rand = new Random();
        int maxAmountOfMatches = matches / 2;
        return rand.nextInt(maxAmountOfMatches) + 1;
    }



}
