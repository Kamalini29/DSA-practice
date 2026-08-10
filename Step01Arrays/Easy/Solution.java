package Easy;

public class Solution{
    public int GetMaxnum(int[] arr, int n){
        int max = arr[0];
        for (int i = 1; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] a = {1,2,3,4,5};
        int[] b = {2,5,3,1,9,3,0};

        System.out.println(s.GetMaxnum(a, a.length));
        System.out.println(s.GetMaxnum(b, b.length));
    }
}
