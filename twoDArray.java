import java.util.Scanner;

//Create a 2D array of integers, input all the elements and find out the sum of the elements.
public class twoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int sum = 0 ;
        System.out.println("Enter the values of all the elements of 3X3 array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
     
     
     
   }

   System.out.println("Sum of all the elements of the array is " + sum);
    }

    
    
}

