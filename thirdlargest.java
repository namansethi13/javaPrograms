//WAP to find third largest number in an array
public class thirdlargest {

    public static void main(String[] args) {
        int[] arr = {10 , 20 , 4 , 8 , 30, 3 , 100};
        int largest = Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        int third= Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>largest){
                int temp;
                temp = second;
                second = largest;
                third = temp;
                largest = arr[i];

            }
            else if(arr[i]>second){
                third = second;
                second = arr[i];
            }
            else if(arr[i]>third){
                third = arr[i];
            }
        }

        System.out.println("Third largest number in the array is " + third);
    }
}