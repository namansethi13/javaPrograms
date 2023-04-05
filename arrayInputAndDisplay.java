import java.util.Scanner;

public class arrayInputAndDisplay {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        inputArray(arr);

        displayArray(arr);
    }

    // Function to input array elements
    public static void inputArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Function to display array elements
    public static void displayArray(int[][] arr) {
        System.out.println("Array elements are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}