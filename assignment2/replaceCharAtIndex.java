package assignment2;

import java.util.Scanner;

public class replaceCharAtIndex {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        int index;
        char c;

        System.out.println("Enter the string");
        str = sc.nextLine();
        System.out.println("Enter Index You Want To Change");
        index = sc.nextInt();
        if(index>=0 && index<str.length()){
            
            System.out.println("Enter the new character");
            c = sc.next().charAt(0);

            char arr[] = str.toCharArray();

            arr[index] = c;
            
            str = new String(arr);


            System.out.println("New string is "+str);
        }

        else{
            System.out.println("Invalid index");
        }
    }
    
}
