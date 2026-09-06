package Step01Arrays.Medium;

public class KadanesAlgorithm {
    
    public int findMaxSubarray(int[] arr){
        int n = arr.length;
        int max=arr[0];
        for(int i=0; i<n;i++){
            int sum =0;
            for(int j =i;j<n;j++){
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }

        return max;
    }
    public static void main(String[] args){
        int[] arr = {2, 3, 5, -2, 7, -4};

        KadanesAlgorithm k = new KadanesAlgorithm();
        System.out.println(k.findMaxSubarray(arr));
    }
}
