import java.util.Scanner;

//WAP to take 1D array, sc the size of array, input all the elements
// in array. Make a menu driven program to find out sum, average,
// search an element in the array, reverse an array.

public class oneDarray {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            
            while (true) {
                System.out.println("Choose an operation:");
                System.out.println("1. Find sum");
                System.out.println("2. Find average");
                System.out.println("3. Search an element");
                System.out.println("4. Reverse the array");
                System.out.println("5. Exit");
                
                int choice = sc.nextInt();
                
                switch (choice) {
                    case 1:
                        int sum = 0;
                        for (int i = 0; i < size; i++) {
                            sum += arr[i];
                        }
                        System.out.println("Sum of elements in the array: " + sum);
                        break;
                        
                    case 2:
                        int total = 0;
                        for (int i = 0; i < size; i++) {
                            total += arr[i];
                        }
                        double avg = (double) total / size;
                        System.out.println("Average of elements in the array: " + avg);
                        break;
                        
                    case 3:
                        System.out.print("Enter the element to search: ");
                        int key = sc.nextInt();
                        boolean found = false;
                        for (int i = 0; i < size; i++) {
                            if (arr[i] == key) {
                                System.out.println("Element found at index " + i);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Element not found in the array.");
                        }
                        break;
                        
                    case 4:
                        for (int i = 0; i < size / 2; i++) {
                            int temp = arr[i];
                            arr[i] = arr[size - i - 1];
                            arr[size - i - 1] = temp;
                        }
                        System.out.println("Array reversed.");
                        System.out.print("New array: ");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                        break;
                        
                    case 5:
                        System.exit(0);
                        break;
                        
                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
                }
            }
    }
    
}
