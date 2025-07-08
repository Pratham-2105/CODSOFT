import java.util.Scanner;

public class codsoft_3 {
    public static void main(String[] args) {
        double balance = 1000.00; // default balance is 1000;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nATM MACHINE");
            System.out.println("1 for Withdraw");
            System.out.println("2 for Deposit");
            System.out.println("3 for Check Balance");
            System.out.println("4 for EXIT");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter money to withdraw:");
                    double w = sc.nextDouble();
                    if (balance >= w) {
                        balance = balance - w;
                        System.out.println("Take your money");
                    } else {
                        System.out.println("Not enough money");
                    }
                    break;
                case 2:
                    System.out.print("Enter money to deposit:");
                    double d = sc.nextDouble();
                    balance = balance + d;
                    System.out.println("Your money has been deposited");
                    break;
                case 3:
                    System.out.println("Balance : " + balance);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}