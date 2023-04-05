//Write a java program to remove duplicate element in an array.
import java.util.ArrayList;
import java.util.HashMap;

public class duplicatesInArray {

    public static void main(String[] args) {

        HashMap<Integer, Boolean> map = new HashMap<>();
        int[] arr = {1 , 3 , 5 , 6 , 2 , 4 , 5 , 6 , 10 , 3 , 4 };
        ArrayList<Integer> newArr= new ArrayList <> () ;


        for(int i : arr ){
            if (map.containsKey(i)) {
                continue;
            }
            else{
                map.put(i, true);
                newArr.add(i);
            }
        }



        System.out.println("Array without duplicates :");
        for (int i : newArr) {
            System.out.print(i + " ");
        }

        
    }
}
