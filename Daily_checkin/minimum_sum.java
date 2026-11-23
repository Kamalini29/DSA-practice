

import java.util.Arrays;

public class minimum_sum {
  
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int cost1 = nums[n - 1] - nums[2];

        int cost2 = nums[n - 2] - nums[1];

        int cost3 = nums[n - 3] - nums[0];

        return Math.min(cost1, Math.min(cost2, cost3));
    }
}

