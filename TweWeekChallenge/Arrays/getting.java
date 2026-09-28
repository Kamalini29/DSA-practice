package TweWeekChallenge.Arrays;

public class getting {
  
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {

            int product = 1;

            for (int j = 0; j < n; j++) {

                if (i == j) {
                    continue;
                }

                product = product * nums[j];
            }

            answer[i] = product;
        }

        return answer;
    }

    public static void main(String[] args){
        getting g = new getting();
        int[] a = g.productExceptSelf(new int[]{23, 4, 5, 2, 5, 3});
    }

}
