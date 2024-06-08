/* COP 3503C Assignment 2
This program is written by: Izaac Plambeck */

import java.util.Scanner;

public class Main {

    // Directions for right, left, down, up, and diagonals
    private static final int[][] DIRECTIONS = {
            {0, 1}, {0, -1}, {1, 0}, {-1, 0},
            {1, 1}, {-1, -1}, {1, -1}, {-1, 1}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read matrix dimensions and number of words
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int S = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Read the matrix
        char[][] matrix = new char[M][N];
        for (int i = 0; i < M; i++) {
            String line = scanner.nextLine();
            String[] chars = line.split(" ");
            for (int j = 0; j < N; j++) {
                matrix[i][j] = chars[j].charAt(0);
            }
        }

        // Read the words to be found
        String[] words = new String[S];
        for (int i = 0; i < S; i++) {
            words[i] = scanner.nextLine();
        }

        // Search for each word in the matrix
        for (String word : words) {
            boolean found = false;
            boolean[][] pathMatrix = new boolean[M][N];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (matrix[i][j] == word.charAt(0) && backtracking(matrix, word, i, j, 0, pathMatrix)) {
                        found = true;
                        printMatrixWithPath(matrix, pathMatrix, word);
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if (!found) {
                System.out.println("Looking for " + word);
                System.out.println(word + " not found!\n");
            }
        }

        scanner.close();
    }

    private static boolean backtracking(char[][] matrix, String word, int i, int j, int index, boolean[][] pathMatrix) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] != word.charAt(index) || pathMatrix[i][j]) {
            return false;
        }

        pathMatrix[i][j] = true;

        for (int[] direction : DIRECTIONS) {
            int newI = i + direction[0];
            int newJ = j + direction[1];
            if (backtracking(matrix, word, newI, newJ, index + 1, pathMatrix)) {
                return true;
            }
        }

        pathMatrix[i][j] = false;
        return false;
    }

    private static void printMatrixWithPath(char[][] matrix, boolean[][] pathMatrix, String word) {
        System.out.println("Looking for " + word);
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[0].length; j++) {
                if (pathMatrix[i][j]) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print(" ");
                }
                if (j < matrix[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        System.out.println();
    }
}