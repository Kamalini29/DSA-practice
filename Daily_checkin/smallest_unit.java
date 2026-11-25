import java.util.HashMap;
import java.util.Map;
public class smallest_unit {
    


    private static final long BASE1 = 100003L;
    private static final long MOD1 = 1_000_000_007L;
    private static final long BASE2 = 100019L;
    private static final long MOD2 = 1_000_000_009L;

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        long[] pow1 = new long[n + 1];
        long[] pow2 = new long[n + 1];
        pow1[0] = 1;
        pow2[0] = 1;

        for (int i = 1; i <= n; i++) {
            pow1[i] = (pow1[i - 1] * BASE1) % MOD1;
            pow2[i] = (pow2[i - 1] * BASE2) % MOD2;
        }

        int low = 1, high = n, ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (hasUniqueSubarrayOfLength(nums, mid, pow1, pow2)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean hasUniqueSubarrayOfLength(int[] nums, int len, long[] pow1, long[] pow2) {
        int n = nums.length;
        long h1 = 0, h2 = 0;

        for (int i = 0; i < len; i++) {
            long val = nums[i] + 1L;
            h1 = (h1 * BASE1 + val) % MOD1;
            h2 = (h2 * BASE2 + val) % MOD2;
        }

        Map<Long, Integer> freq = new HashMap<>();
        long combined = (h1 << 32) | (h2 & 0xffffffffL);
        freq.put(combined, 1);

        long topPow1 = pow1[len - 1];
        long topPow2 = pow2[len - 1];

        for (int i = len; i < n; i++) {
            long outVal = nums[i - len] + 1L;
            long inVal = nums[i] + 1L;

            h1 = (h1 - (outVal * topPow1) % MOD1 + MOD1) % MOD1;
            h1 = (h1 * BASE1 + inVal) % MOD1;

            h2 = (h2 - (outVal * topPow2) % MOD2 + MOD2) % MOD2;
            h2 = (h2 * BASE2 + inVal) % MOD2;

            combined = (h1 << 32) | (h2 & 0xffffffffL);
            freq.put(combined, freq.getOrDefault(combined, 0) + 1);
        }

        for (int count : freq.values()) {
            if (count == 1) {
                return true;
            }
        }
        return false;
    }
}


