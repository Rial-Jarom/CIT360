import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    // Initialize equation variables
    int num1 = 0;
    int num2 = 0;

    // Run the program
    public void run() {
        welcome();
        multiply();
        close();
    }

    // Close the scanner
    private void close() {
        scanner.close();
    }

    // Show welcome
    private void welcome() {
        System.out.println("Welcome!");
    }

    // Capture two integer values
    private void multiply() {
        System.out.println("Your First Integer:");
        num1 = scanner.nextInt();
        System.out.println("Your Second Integer:");
        num2 = scanner.nextInt();

        // Do computations
        int sum = Controller.add(num1,num2);
        int difference = Controller.subtract(num1,num2);
        int product = Controller.multiply(num1,num2);
        double quotient = Controller.divide(num1,num2);

        System.out.println("\n");
        System.out.println("Computations of Your Two Integers");
        System.out.println(num1 + "+" + num2 + "=" + sum);
        System.out.println(num1 + "-" + num2 + "=" + difference);
        System.out.println(num1 + "*" + num2 + "=" + product);
        System.out.println(num1 + "/" + num2 + "=" + quotient);
    }
}
