package LeetCode;

import java.util.Arrays;

public class LeftRotateArray {

    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        // Handle cases where d is greater than n
        d = d % n;

        // Reverse the first part
        reverseArray(arr, 0, d - 1);
        // Reverse the second part
        reverseArray(arr, d, n - 1);
        // Reverse the whole array
        reverseArray(arr, 0, n - 1);
    }

    // Function to reverse a portion of the array
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to print the array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3; // Number of positions to rotate

        System.out.println("Original array:");
        printArray(arr);

        leftRotate(arr, d);

        System.out.println("Array after left rotation by " + d + " positions:");
        printArray(arr);
    }

}
