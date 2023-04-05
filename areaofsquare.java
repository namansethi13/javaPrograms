// WAP to calculate the area of a square.
import java.util.*;
/**
 * areaofsquare
 */
public class areaofsquare {

    public static void main(String[] args) {
        int side;
        System.out.println("Enter the side of the square");
        try (Scanner sc = new Scanner(System.in)) {
            side = sc.nextInt();
        }
        int area  = side*side;

        System.out.println("Area of square is "+ area);

    }
}