import java.util.Scanner;

//WAP to generate the table of the number entered by the user.


public class tableofthenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(num +  " X " + i +" = " + num*i);
        }
    }
}
