//WAP to print the first 10 prime numbers.


public class firstTenPrime {
        public static void main(String[] args) {

            int num = 2;
            int n = 0;
            System.out.println("First ten prime numbers are :");
            while(n !=10){
                if(isprime(num)){
                    System.out.print(num + " ");
                    n++;
                }
                num++;
            }
            
        }

        public static boolean isprime(int num){

            for (int i = 2 ; i <= Math.sqrt(num) ; i++) {

                if(num % i == 0){
                    return false;
                }
                
            }
            return true;
        }
}
