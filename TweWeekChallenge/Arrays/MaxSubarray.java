package TweWeekChallenge.Arrays;

public class MaxSubarray {
  
    public int maxSubArray(int[] arr) {
  
        int res = arr[0];
  
        // Outer loop for starting point of subarray
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
      
            // Inner loop for ending point of subarray
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
              
                // Update res if currSum is greater than res
                res = Math.max(res, currSum);
            }
        }
        return res;
    }
    public static void main(String[] args){
        MaxSubarray d = new MaxSubarray();
        int[] ar = {2,5,3,1,7,4,0,3,4};

        System.out.print(d.maxSubArray(ar));
    }

}

