package assignment2;

import java.util.Scanner;

public class compareStrings {

    public static void main(String[] args) { 
        String str1;
        String str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        str1 = sc.nextLine();
        System.out.println("Enter second string");
        str2 = sc.nextLine();

        if(str1 == str2){
            System.out.println("First and Second string are referring to the same instance");
        }
        else if(str1.equals(str2)){
            System.out.println("First and Second string are equal");
        }
        else if(str1.equalsIgnoreCase(str2)){
            System.out.println("First and Second string are equal if cases are ignored");
        }
        else{
            System.out.println("First and second string are not equal");
        }
    }
}
