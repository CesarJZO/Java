import java.util.*;

public class Games {
    public static void GuesserGame() {
        Scanner s = new Scanner(System.in);
        System.out.println("Guess the number that I'm thinking.");
        final int N = new Random().nextInt(100);
        int in;
        do {
            System.out.print("Number: ");
            in = s.nextInt();
            if (in != N)
                if (in < N)
                    System.out.println("That's too low!");
                else
                    System.out.println("That's too high!");
        } while (in != N);
        System.out.println("I was thinking in " + in + ". You won!");
        s.close();
    }
}
