package Intense_DSA;

public class TwoSumI {
    public int[] check(int[] arr, int target){
        int[] pair = {-1,-1};
        for(int i =0;i<arr.length;i++){
            for(int j=0;j< arr.length; j++){
                if(i==j) continue;
                if(arr[i]+arr[j] == target){
                    pair[0] = arr[i];
                    pair[1] = arr[j];

                    return pair;
                }
            }
        }

        return pair;
    }

    public static void main(String[] args){
        TwoSumI s = new TwoSumI();
        int[] a = {1,4,2,5,6,3};
        int[] rec = s.check(a,9);

        for(int i =0; i<rec.length; i++){
            System.out.print(rec[i]+" ");
        }
    }
}
