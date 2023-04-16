package assignment2;

import java.util.Scanner;

import javax.xml.transform.Source;

public class evenCharWords {
    public static void main(String[] args) {
        String str;
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Sentence");
        str = sc.nextLine();

        String wordArr[] = str.split(" ");

        for (String word : wordArr) {
            if (word.length()%2 ==0 ) {
                System.out.print(word +" ");
            }
           
        }

    }
}
