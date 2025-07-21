import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Multiplication Table Generator ===");

        // Input number and range
        System.out.print("Enter the number for which you want the table: ");
        int number = scanner.nextInt();

        System.out.print("Enter the range (e.g., 10 for 1 to 10): ");
        int range = scanner.nextInt();

        scanner.close();

        // Generate and print multiplication table
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 1; i <= range; i++) {
            System.out.printf("%d x %d = %d\n", number, i, number * i);
        }
    }
}
