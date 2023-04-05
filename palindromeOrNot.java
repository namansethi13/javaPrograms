import java.util.Scanner;

import javax.xml.transform.Source;

//Write a program to check whether a given number is palindrome or not

public class palindromeOrNot {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
    
        num = sc.nextInt();
        if(isPlaindrome(num)){
            System.out.println(num + " is palindrome");
            return;
        };
        System.out.println(num +" is not palindrome");
    }

    public static boolean isPlaindrome(int num){
        int half= 0;

        for (int i = 0; i < Math.floor(Math.log10(num))+1/2; i++) {

            half *=10;
            half += num%10;
            num /=10;
        }

        return (num == half) || (num/10 == half);
    }


}