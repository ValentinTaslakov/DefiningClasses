package MultidimensionalArrays.exersice;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[n][n];

        matrix = readMatrix(n,scan);
        int sumPrimary = 0;
        int sumSecondary = 0;
        for (int i = 0; i < n; i++) {
            sumPrimary+=matrix[i][i];
            sumSecondary+=matrix[i][n-1-i];
        }
        int difference = Math.abs(sumPrimary-sumSecondary);
        System.out.println(difference);
    }

    private static int[][] readMatrix(int n, Scanner scan) {
        int[][]matrix = new int[n][n];
        for (int row = 0; row < n; row++) {
            int[] line = Arrays.stream(scan.nextLine().split(" "))
                            .mapToInt(e -> Integer.parseInt(e) )
                            .toArray();
            matrix[row]=line;
        }
        return matrix;
    }
}
