import java.util.Scanner;

// WAP to calculate the factorial of a number.



public class factorialofanumber {
    public static void main(String[] args) {
        int num;
        int fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();

        for (int i = num; i > 0; i--) {
            fact *= i;
            
        }


        System.out.println("Factorial of " + num + " is " + fact);

    }   
}
