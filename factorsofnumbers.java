//WAP to find the factors of numbers from 50 to 100.

public class factorsofnumbers {
    public static void main(String[] args) {
        for(int i = 50 ; i <= 100 ; i++ ){
            System.out.println("Factors of " + i + " are: ");
            for(int j = 1 ; j <= i ; j++){
                if(i%j == 0){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
