import java.util.Scanner;

public class FactorsProgram {

    // Method to find factors and store in array
    public static int[] findFactors(int num) {

        int count = 0;

        // Count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Create array
        int[] factors = new int[count];

        int index = 0;

        // Store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }
