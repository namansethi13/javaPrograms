//WAP to print the first 10 elements of the fibonacci series.

/**
 * firstTenFibonacci
 */
public class firstTenFibonacci {

    public static void main(String[] args) {
        int prev = 0;
        int curr = 1;

        int count = 0;
        while (count != 10) {
            System.out.print(prev + " ");
            int temp = curr;
           curr = curr + prev;
           prev = temp;
            count++ ;
            
        }
    }
}