//WAP to print odd numbers between 1 and 20.

public class oddnobetween {
    public static void main(String[] args) {
        for(int i = 0 ; i <= 20 ; i++){
            if( i % 2 == 0 ) continue;
            System.out.print(i + " ");
        }
    }
}
