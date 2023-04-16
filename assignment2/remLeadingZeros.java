package assignment2;

import java.util.Scanner;

public class remLeadingZeros {
    public static void main(String[] args) {
        String str;
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        str = sc.nextLine();

        while(str.charAt(i) == '0'){
            i++;
        }
        str = str.substring(i);
        System.out.println("String without leading zeros : "+ str);
    }
}
