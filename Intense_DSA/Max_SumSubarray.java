package Intense_DSA;

public class Max_SumSubarray {
    public int SubarraySum(int[] arr){
        int max =arr[0]; 
        for(int i=0;i< arr.length;i++){
            int sum =0;
            for(int j=i; j<arr.length;j++){
                sum += arr[j];

                max = Math.max(sum, max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Max_SumSubarray s = new Max_SumSubarray();

        int[] a = {1,-2,4,-6,10,-34};

        System.out.println(s.SubarraySum(a));

      
    }
}
