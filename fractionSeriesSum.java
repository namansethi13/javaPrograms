//WAP to CALCULATE : 1+ ½ + 1/3 + ¼+…+ 1/10.

public class fractionSeriesSum {
    public static void main(String[] args) {
        float sum = 0;
        for( int i = 1 ; i <= 10 ; i ++) {sum += 1.0/i; }
        System.out.println("sum of the series is " + sum); 
    }
}
