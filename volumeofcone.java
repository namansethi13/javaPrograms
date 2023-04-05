//WAP to compute volume of a cone.
import java.util.Scanner;

public class volumeofcone {
    public static void main(String[] args) {
        double r , h;

        System.out.println("Enter radius and height of the cone");

        Scanner sc = new Scanner(System.in);

        r = sc.nextInt();
        h = sc.nextInt();


        double volume = (1.0/3.0) * 3.14 * r *r *h;

        System.out.println("volume of the cone is " + volume);
    }
}
