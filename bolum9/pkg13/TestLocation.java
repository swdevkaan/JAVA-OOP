package bolum9.pkg13;

import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        Location loc = Location.locateLargest(matrix);

        System.out.println("The location of the largest element is " 
                           + loc.maxValue + " at (" + loc.row + ", " + loc.column + ")");
    }
}