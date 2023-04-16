package assignment2;

import java.util.Scanner;

import javax.xml.transform.Source;

public class charAtIndex {
    public static void main(String[] args) {
        String str;
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = sc.nextLine();
        System.out.println("Enter the index of the character you wantto retrieve");
        i = sc.nextInt();
        System.out.printf("Character at %d indes is %c", i, str.charAt(i));
    }
}
