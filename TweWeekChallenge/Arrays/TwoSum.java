package TweWeekChallenge.Arrays;

import java.util.HashMap;

public class TwoSum {
    public boolean Sol_brute_2sum (int[] arr, int target){
        int n = arr.length;

        for(int i =0; i<n; i++){
            for(int j = 0; j<n;j++){
                if(i == j) continue;
                if(arr[i] + arr[j] == target){
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
}
