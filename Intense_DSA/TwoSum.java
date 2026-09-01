package Intense_DSA;

import Step01Arrays.Medium.Sort012;

public class TwoSum {
    public int[] isSumExist(int[] arr, int target){
        int[] set = {-1,-1};
        for(int i =0; i<arr.length; i++){
            for(int j=0;j<arr.length;j++){
                if(i==j) continue;
                if(arr[i]+arr[j] == target){
                    set[0] = arr[i];
                    set[1] = arr[j];
                    return set;
                }
            }
        }


        return set;
    }

    public static void main(String[] args) {
        TwoSum s = new TwoSum();

        int[] a = {1,2,4,6,10,34};

        int[] b = new int[2];
        b = s.isSumExist(a,3);

        for(int i =0; i<b.length; i++){
            System.out.print(b[i]+ " ");
        }

      
    }

}
