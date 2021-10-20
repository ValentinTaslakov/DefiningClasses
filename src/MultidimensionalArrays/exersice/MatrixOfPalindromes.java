package MultidimensionalArrays.exersice;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);
        String[][] matrix = new String[r][c];

        matrix = fillMatrix(r, c);
        printMatrix(matrix);


    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


    private static String[][] fillMatrix(int r, int c) {
        String[][] matrix = new String[r][c];
        for (int row = 0; row < r; row++) {
            char firsSymbol = (char) (97+row);
            char thirdSymbol = (char) (97+row);
            char secondSymbol = (char) (97+row);

            for (int col = 0; col < c; col++) {
                String word = String.valueOf(firsSymbol) + String.valueOf(secondSymbol)
                        + String.valueOf(thirdSymbol);
                matrix[row][col] = word;
                secondSymbol++;
            }


        }
        return matrix;
    }
}
