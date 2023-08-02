package Test;


import java.util.Arrays;
import java.util.Arrays;

public class AlphabetRangoli {
    public static void main(String[] args) {
        int size = 3; // Change the value of size as per your requirement
        printAlphabetRangoli(size);
    }

    public static void printAlphabetRangoli(int size) {
        int n = 2 * size - 1;
        char[][] grid = new char[n][n];
        char startChar = (char) ('a' + size - 1);

        // Initialize grid with '-'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '-';
            }
        }

        // Fill the grid with characters
        for (int i = 0; i < size; i++) {
            int currentChar = startChar - i;
            int left = size - 1;
            int right = size - 1;

            for (int j = 0; j <= i; j++) {
                grid[i][left] = (char) currentChar; // Left side of the grid
                grid[i][right] = (char) currentChar; // Right side of the grid
                grid[n - i - 1][left] = (char) currentChar; // Bottom left side of the grid
                grid[n - i - 1][right] = (char) currentChar; // Bottom right side of the grid
                left--;
                right++;
                currentChar++;
            }
        }

        // Print the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}