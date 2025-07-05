import java.util.Scanner;

public class codsoft_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many subjects: ");
        int n = s.nextInt();
        int t = 0; // total marks

        for (int i = 0; i < n; i++) {
            System.out.print("enter marks for sub " + (i + 1) + ": ");
            t = t + s.nextInt();
        }

        double a = (double) t / n; // average
        char g; // grade

        if (a >= 90) {
            g = 'A';
        } else if (a >= 80) {
            g = 'B';
        } else if (a >= 70) {
            g = 'C';
        } else if (a >= 60) {
            g = 'D';
        } else {
            g = 'F';
        }

        System.out.println("Total Marks = " + t);
        System.out.println("Average % = " + a);
        System.out.println("Grade = " + g);
        s.close();
    }
}
