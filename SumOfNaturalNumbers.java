import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find sum
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    // Method using formula
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if number is natural
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {

            // Find sums
            int recursiveResult = recursiveSum(n);
            int formulaResult = formulaSum(n);

            // Display results
            System.out.println("Sum using recursion = " + recursiveResult);
            System.out.println("Sum using formula = " + formulaResult);

            // Compare results
            if (recursiveResult == formulaResult) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("Results are not equal.");
            }
        }

        sc.close();
    }
}
