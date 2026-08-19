package Basics.HashMap;
import java.util.HashMap;
import java.util.Map;

public class Low_High_Frequency{

public class Main {

    public static void main(String[] args) {

        int[] array = {10, 5, 10, 15, 10, 5};

        // Create HashMap
        // Key   = element
        // Value = frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int x : array) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Variables for maximum and minimum frequency
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;

        int maxElement = 0;
        int minElement = 0;

        // Find highest and lowest frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int element = entry.getKey();
            int frequency = entry.getValue();

            // Highest frequency
            if (frequency > maxFreq) {
                maxFreq = frequency;
                maxElement = element;
            }

            // Lowest frequency
            if (frequency < minFreq) {
                minFreq = frequency;
                minElement = element;
            }
        }

        // Print result
        System.out.println(maxElement + " " + minElement);
    }
}
}