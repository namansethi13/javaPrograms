import java.util.Scanner;

//WAP to find volume of sphere
public class volumeOfSphere {
    public static void main(String[] args) {
        double radius;
        System.out.println("enter the radius of the sphere");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        double area = (4.0/3.0) * Math.PI * radius * radius *radius;

        System.out.println("Area of the sphere is " + area);
    }
}
