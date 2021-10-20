package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[][] matrix = new int[N][M];

        matrix = readMatrix(N,M,scan);
        int biggestSum = 0;
        int[][] winnerMatrix = new int[3][3];

        for (int r = 0; r < matrix.length - 2; r++) {
            for (int c = 0; c < matrix[r].length - 2; c++) {
                int current = matrix[r][c];
                int inRight = matrix[r][c + 1];
                int inRight2 = matrix[r][c+2];
                int inBottom = matrix[r + 1][c];
                int inBottom2 = matrix[r+2][c];
                int inDiagonally = matrix[r + 1][c + 1];
                int inDiagonally2 = matrix[r+2][c+2];
                int middle = matrix[r+2][c+1];
                int middle2 = matrix[r+1][c+2];
                int sum = current + inRight + inBottom + inDiagonally+inRight2
                        +inBottom2+inDiagonally2+middle+middle2;
                if (sum>biggestSum){
                    biggestSum = sum;
                    winnerMatrix[0][0] = current;
                    winnerMatrix[0][1] = inRight;
                    winnerMatrix[0][2] = inRight2;
                    winnerMatrix[1][0] = inBottom;
                    winnerMatrix[2][0] = inBottom2;
                    winnerMatrix[1][1] = inDiagonally;
                    winnerMatrix[2][2] = inDiagonally2;
                    winnerMatrix[2][1] = middle;
                    winnerMatrix[1][2] = middle2;
                }
            }
        }
        System.out.println("Sum = "+biggestSum);
        for (int i = 0; i < winnerMatrix.length; i++) {
            for (int j = 0; j < winnerMatrix[i].length; j++) {
                System.out.print(winnerMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] readMatrix(int r, int c, Scanner scan) {
        int[][]matrix = new int[r][c];
        for (int row = 0; row < r; row++) {
            int[] line = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e) )
                    .toArray();
            matrix[row]=line;
        }
        return matrix;
    }
}
