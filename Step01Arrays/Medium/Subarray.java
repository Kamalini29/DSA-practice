package Step01Arrays.Medium;

public class Subarray{
    public int checkSum(int[] arr, int target){
        int count = 0;

        for(int i = 0;i<arr.length;i++){
            int sum = arr[i];
            for(int j = i+1; j< arr.length;j++){
                sum+= arr[j];
                if(sum == target){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4};

        int k = 6;

        Subarray sol = new Subarray();

        int result = sol.checkSum(arr, k);

        System.out.println("The number of subarrays is: " + result);
    }
}