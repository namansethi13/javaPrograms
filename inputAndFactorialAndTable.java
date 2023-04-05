import java.util.Scanner;

//Use Scanner class to input a number and print its table. Print its factorial also.

public class inputAndFactorialAndTable {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        System.out.println("Factorial of the number is "+factorial(num));
        printTable(num);

    }

    public static int factorial(int num){
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact *= i;
            
        }


        return fact;

    }

    public static void printTable(int num) {
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(num +  " X " + i +" = " + num*i);
        }
    }
}
