package assignment2;

import java.util.Scanner;

public class swapPairOfChar {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        str = sc.nextLine();

        char strarr[] = str.toCharArray();
        int n = str.length() %2 ==0? str.length():str.length()-1; //if there are not even no of char then last character cannot be paired

        for (int i = 0; i+1 < n; i+=2) { //looping till second last char
            char temp = strarr[i];
            strarr[i] = strarr[i+1];
            strarr[i+1] = temp;
        }

        str = new String(strarr);
        System.out.println("Swapped string is "+str);
    }

}
