package assignment2;

import java.util.Scanner;

public class sortString {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        str = sc.nextLine();

        char strarr[] = str.toCharArray();
        insertionSort(strarr , strarr.length);
        str =  new String(strarr);
        System.out.println("Sorted string is "+ str);
    }

    public static void insertionSort(char arr[], int n)
{
    
    int i, j; 
    char key;
    for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}
}
