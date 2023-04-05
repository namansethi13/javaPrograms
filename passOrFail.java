import java.util.Scanner;

//WAP to input marks in 5 subjects. Calculate the percentage of
// marks if the percentage is greater than 60, print 1st division, if
// greater than equal to 40 and less than 60, then print 2nd division, if
// greater than equal to 33 and less than 40, then print 3rd division
// otherwise fail.

public class passOrFail {
 public static void main(String[] args) {
    float total = 0;
    double percentage= 0;
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];

    System.out.println("Enter marks of the 5 subjects out of hundered");

    for (int i = 0; i < 5; i++) {
        arr[i] = sc.nextInt();
    }

    for (int i : arr) {
        total += i;
    }
    percentage = (total/500.0) * 100.0;
    if (percentage>=60) {
        System.out.println("First division");
    }
    else if (percentage>=40 && percentage < 60) {
        System.out.println("Second division");
    }
    else if (percentage>=33 && percentage < 40) {
        System.out.println("Third division");
    }
    else{
        System.out.println("Fail");
    }

 }   
}
