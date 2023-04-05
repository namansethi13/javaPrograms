//WAP to find the armstrong numbers from 1 to 999.
public class armstrongnum {
    public static void main(String[] args) {

        for(int i = 1 ; i <=999 ; i++){
            if(isArmstrong(i) == true){
                System.out.print(i + " ");
            }
        }
        
    }

    public static boolean isArmstrong(int num) {
        int temp = num;
        int armstrong = 0;
        double digits = Math.floor(Math.log10(num) )+ 1;
        while(temp > 0){
            armstrong += Math.pow(temp%10, digits);
            temp /= 10;
        }
        if(armstrong == num){
            return true;
        }
        return false;
        
    }
    
}
