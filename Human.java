import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Human extends Player {

    public Human(String name) {
        super(name);
    }

    @Override
    int drawMatches(int matches) {

        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        int maxDraw = matches / 2;

        int x;
        try {
            String s = br.readLine();
            x = Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            // If input is not an int, run the method again
            System.out.println("Invalid input, try again..");
            x = drawMatches(matches);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
            // Any other type of exception is simply passed on
        }

        if(x > maxDraw) {
            System.out.println("You have to draw half or less of the matches. Try again..");
            x = drawMatches(matches);
        } else if(x < 1) {
            System.out.println("Invalid number of matches to draw. Try again..");
            x = drawMatches(matches);
        }

        return x;
    }

}
