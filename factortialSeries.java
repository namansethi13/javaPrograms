//WAP to Evaluate the series : 1/1! + 1/2! + 1/3! +....+ 1/10!  

public class factortialSeries {
    public static void main(String[] args) {
        double sum = 0;
        for(int i  = 1 ; i <= 10; i++){
            double fact = 1;
            for (int j = i; j > 0; j--) {
                fact *= j;
            }
            sum += 1/fact;
        }

        System.out.println("sum of the series is " + sum);
    }
}
