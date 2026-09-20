package Step01Arrays.Medium;
import java.util.*;

public class unite {
  
    public List<Integer> findUnion(int[] nums1, int[] nums2) {
        List<Integer> unionResult = new ArrayList<>();

        for (int value : nums1) {
            boolean alreadyPresent = false;

            /*
             * Search the collected values before
             * inserting the current value.
             */
            for (int storedValue : unionResult) {
                if (storedValue == value) {
                    alreadyPresent = true;
                    break;
                }
            }

            if (!alreadyPresent) {
                unionResult.add(value);
            }
        }

        for (int value : nums2) {
            boolean alreadyPresent = false;

            /*
             * Prevent values already collected from
             * being inserted a second time.
             */
            for (int storedValue : unionResult) {
                if (storedValue == value) {
                    alreadyPresent = true;
                    break;
                }
            }

            if (!alreadyPresent) {
                unionResult.add(value);
            }
        }

        // Restore sorted order after collecting both arrays.
        Collections.sort(unionResult);

        return unionResult;
    }



    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 4};
        int[] nums2 = {2, 3, 5, 6};

        Solution solution = new Solution();
        List<Integer> answer = solution.findUnion(nums1, nums2);

        for (int value : answer) {
            System.out.print(value + " ");
        }
    }
}

