package MultidimensionalArrays.exersice;

import java.util.Arrays;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] dimension = scan.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimension[0]);
        int cols = Integer.parseInt(dimension[1]);
        int[][] matrix = new int[rows][cols];
        matrix = fillMatrix(matrix, rows, cols);

        String input = scan.nextLine();

        while (!input.equals("Nuke it from orbit")) {
            int[] coordinates = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int row = coordinates[0];
            int col = coordinates[1];
            int radius = coordinates[2];
            matrix = destroyingMatrix(matrix, row, col, radius, rows, cols);

            input = scan.nextLine();
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] destroyingMatrix(int[][] matrix, int row
            , int col, int radius, int rows, int cols) {

        if (row > rows || col > cols) {
            return matrix;
        }
        int[][] destroyedMatrix = new int[rows][cols];
        int crossCentre = matrix[row][col];
        int upBorder = row - radius;
        if (upBorder < 0) {
            upBorder = 0;
        }
        int bottomBorder = row + radius;
        if (bottomBorder >= rows) {
            bottomBorder = rows - 1;
        }
        int leftBorder = col - radius;
        if (leftBorder < 0) {
            leftBorder = 0;
        }
        int rightBorder = col + radius;
        if (rightBorder >= cols) {
            rightBorder = cols - 1;
        }
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] != matrix[upBorder][col]
                        && matrix[r][c] != matrix[row][leftBorder]) {
                    destroyedMatrix[r][c] = matrix[r][c];

                } else {

                }
                if (matrix[row][leftBorder] == matrix[r][c]) {
                    while (leftBorder != rightBorder) {
                        leftBorder++;
                        break;
                    }
                }
            }
            if (upBorder == r) {
                while (upBorder != bottomBorder) {
                    upBorder++;
                    break;
                }
            }
        }


        return destroyedMatrix;
    }

    private static int[][] fillMatrix(int[][] matrix, int rows, int cols) {
        int[][] filletMatrix = new int[rows][cols];
        int n = 1;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                filletMatrix[r][c] = n;
                n++;
            }
        }
        return filletMatrix;
    }
}
