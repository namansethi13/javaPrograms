//Demonstrate the effect of nested break.

public class effectOfNestedBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                System.out.println("i is "+ i +" breaking out of the loop");
                break;
            }
            System.out.println("i is "+ i);
        }
    }
}
