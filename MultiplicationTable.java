import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Multiplication Table Generator ===");
        System.out.println("1. Generate table for one number");
        System.out.println("2. Generate tables for a range of numbers");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            // Single number
            System.out.print("Enter the number: ");
            int number = sc.nextInt();

            System.out.print("Enter the table limit: ");
            int limit = sc.nextInt();

            System.out.println("\nMultiplication Table of " + number);

            for (int i = 1; i <= limit; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }

        } else if (choice == 2) {

            // Range of numbers
            System.out.print("Enter starting number: ");
            int start = sc.nextInt();

            System.out.print("Enter ending number: ");
            int end = sc.nextInt();

            System.out.print("Enter the table limit: ");
            int limit = sc.nextInt();

            System.out.println();

            for (int number = start; number <= end; number++) {

                System.out.println("Multiplication Table of " + number);

                for (int i = 1; i <= limit; i++) {
                    System.out.println(number + " x " + i + " = " + (number * i));
                }

                System.out.println();
            }

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
