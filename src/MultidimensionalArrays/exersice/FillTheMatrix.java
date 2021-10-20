package MultidimensionalArrays.exersice;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputDate = scan.nextLine().split(", ");
        int dimension = Integer.parseInt(inputDate[0]);
        String typePattern = inputDate[1];
        int[][] matrix = new int[dimension][dimension];
        int startNum = 1;

        if (typePattern.equals("A")) {
            matrix = patternA(dimension, startNum);
        } else {
            matrix = patternB(dimension, startNum);
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

    private static int[][] patternA(int d, int startNum) {
        int[][] matrix = new int[d][d];
        for (int row = 0; row < d; row++) {
            for (int col = 0; col < d; col++) {
                matrix[col][row] = startNum;
                startNum++;
            }
        }
        return matrix;
    }

    private static int[][] patternB(int d, int startNum) {
        int[][] matrix = new int[d][d];
        for (int row = 0; row < d; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < d; col++) {
                    matrix[col][row] = startNum;
                    startNum++;
                }
            }else {
                for (int col = d-1; col >= 0 ; col--) {
                    matrix[col][row] = startNum;
                    startNum++;
                }
            }
        }
        return matrix;
    }
}
