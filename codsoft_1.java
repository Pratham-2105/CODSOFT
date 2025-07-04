import java.util.Scanner;
import java.util.Random;

public class codsoft_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rd = new Random();
        boolean pA = true;

        while (pA) {
            int n = rd.nextInt(100) + 1;
            int atts = 10;
            boolean correct = false;
            System.out.println("\nnew game. guess the number. 10 tries.");

            while (atts > 0 && !correct) {
                System.out.print("enter guess: ");
                int g = s.nextInt();

                if (g == n) {
                    System.out.println("you got it.");
                    correct = true;
                } else if (g > n) {
                    System.out.println("too high.");
                } else {
                    System.out.println("too low.");
                }
                atts = atts - 1;
            }

            if (!correct) {
                System.out.println("you lose. number was " + n);
            }

            System.out.print("play again? (yes/no): ");
            String r = s.next();
            pA = r.equalsIgnoreCase("yes");
        }

        s.close();
    }
}