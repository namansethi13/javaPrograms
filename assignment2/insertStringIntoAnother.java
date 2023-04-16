package assignment2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class insertStringIntoAnother {
public static void main(String[] args) {
    String str1;
    String str2;
    Scanner sc = new Scanner(System.in);
    int index;
    System.out.println("Enter first string");
    str1 = sc.nextLine();
    System.out.println("Enter second string");
    str2 = sc.nextLine(); 
    System.out.println("Enter the index at which you want to insert second string");
    index = sc.nextInt();
    char strarr[] = new char[str1.length() + str2.length()];
    for (int i = 0; i < index; i++) {
        strarr[i] = str1.charAt(i);
    } 
    for (int i = 0; i < str2.length(); i++) {
        strarr[index + i] = str2.charAt(i);
    }
    
    for (int i = index; i < str1.length(); i++) {
        strarr[str2.length() + i] = str1.charAt(i);
    }
    
    String result = new String(strarr);

    System.out.println("Final result is "+ result);
}
}
