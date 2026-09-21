package TweWeekChallenge.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public boolean Sol_brute_2sum (int[] arr, int target){
        int n = arr.length;

         for (int i = 0; i < n - 1; i++) {

        for (int j = i + 1; j < n; j++) {

            if (arr[i] + arr[j] == target) {
                return true;
            }
        }
    }

        return false;
    }

    public int[] Sol_optimise_2sum (int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        TwoSum obj = new TwoSum();

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        // Brute Force
        boolean bruteResult = obj.Sol_brute_2sum(arr, target);
        System.out.println("Brute Force: " + bruteResult);

        // Optimized
        int[] optimizedResult = obj.Sol_optimise_2sum(arr, target);
        System.out.println("Optimized: " + Arrays.toString(optimizedResult));
    }
}
