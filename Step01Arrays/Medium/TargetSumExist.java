package Step01Arrays.Medium;

public class TargetSumExist {
    public boolean exist(int[] arr, int target){
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j=0;j<n;j++){
                int sum = arr[i] + arr[j];
                if(sum == target){
                    return true;
                }
            }
        
        }

        return false;
    }
    public static void main(String[] args) {
        TargetSumExist t = new TargetSumExist();
        int[] arr = {1,2,3,4,2,1,4,2,9,4,15};
        boolean b = t.exist(arr, 12);

        System.out.println("is there target: " + b);

    }
}
