package TweWeekChallenge.Arrays;

public class MinimumRotations {

    public static int minRotations(String number) {

        int currentDigit = 0;
        int totalRotations = 0;

        for (int i = 0; i < number.length(); i++) {

            int targetDigit = number.charAt(i) - '0';

            // Direct distance between current and target
            int directDistance = Math.abs(currentDigit - targetDigit);

            // Distance by going around the circular dial
            int circularDistance = 10 - directDistance;

            // Choose the shorter path
            int minimumDistance = Math.min(directDistance, circularDistance);

            totalRotations += minimumDistance;

            // Pointer is now at the target digit
            currentDigit = targetDigit;
        }

        return totalRotations;
    }

    public static void main(String[] args) {

        String number = "0192837465";

        int answer = minRotations(number);

        System.out.println("Minimum rotations: " + answer);
    }
}