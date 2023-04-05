//WAP to calculate the distance traveled by light in 5 days.

/**
 * distancetravelledbylight
 */
public class distancetravelledbylight {

    public static void main(String[] args) {
        final long speed = 299792458;

        long distanceInFiveDays = speed * 60 * 60 * 24 *5;

        System.out.println("Distance travelled by light in 5 days " + distanceInFiveDays);
    }
}