

import java.util.Arrays;
import java.util.HashMap;

class maximum_subarray {

    public int maxSelectedElements(int[] nums) {

        Arrays.sort(nums);

        HashMap<Integer, Integer> dp = new HashMap<>();

        int ans = 0;

        for (int x : nums) {

            // Choice 1: Increase x to x + 1
            int modified = dp.getOrDefault(x, 0) + 1;

            dp.put(x + 1,
                Math.max(dp.getOrDefault(x + 1, 0), modified));

            // Choice 2: Keep x unchanged
            int unchanged = dp.getOrDefault(x - 1, 0) + 1;

            dp.put(x,
                Math.max(dp.getOrDefault(x, 0), unchanged));

            // Update answer
            ans = Math.max(ans, Math.max(
                dp.get(x), dp.get(x + 1)
            ));
        }

        return ans;
    }
}
