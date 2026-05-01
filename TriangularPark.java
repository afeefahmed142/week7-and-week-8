import java.util.Scanner;

public class TriangularPark {

    // Method to calculate rounds
    public static double calculateRounds(double side1, double side2, double side3) {

        double perimeter = side1 + side2 + side3;

        // 5 km = 5000 meters
        return 5000 / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();

        // Method call
        double rounds = calculateRounds(side1, side2, side3);

        // Output
        System.out.println("Number of rounds needed to complete 5 km = " + rounds);

        sc.close();
    }
}
