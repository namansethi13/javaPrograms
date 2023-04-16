package assignment2;

import java.util.Scanner;

public class reverseAString {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string you want to reverse");
        str = sc.nextLine();

        char arr[] = str.toCharArray();

        for(int i = 0 ; i < arr.length/2; i++){

            char temp;
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

        }

        str = new String(arr);
        System.out.println("New String is "+ str);
    }


}
