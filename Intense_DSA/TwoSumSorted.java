package Intense_DSA;

public class TwoSumSorted {
    public int[] checkLR(int[] arr, int target){
        int l =0; int r = arr.length-1;
        int[] pair = {-1, -1};

        while(l<r){
            if(arr[l]+arr[r] == target ){
                pair[0] = arr[l];
                pair[1] = arr[r];
                return pair;
            }
            if(arr[l]+arr[r]<target){
                l++;
            }
            if(arr[l]+arr[r]>target){
                r--;
            }
        }
        return pair;

    }

    public static void main(String[] args){
        TwoSumSorted s = new TwoSumSorted();
        int[] arr = {1,3,4,5,8,9,12};

        int[] result = s.checkLR(arr, 7);

        for(int i =0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
