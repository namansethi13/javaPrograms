package assignment2;

import java.util.Scanner;

public class splitIntoSubstrings {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter string");
        str = sc.nextLine();
        String delimiter;
        System.out.println("Enter the delimiter");
        delimiter = sc.nextLine();
        System.out.println("Enter the number of substrings");
        num = sc.nextInt();
        String subStrArr[] = str.split(delimiter, num);

        System.out.println("SUBSTRINGS: ");
        
        for (String s : subStrArr) {
            System.out.println(s);
        }
    }
}
