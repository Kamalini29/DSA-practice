package TweWeekChallenge.Arrays;

public class Duplicates {
    public void merge(int[] num, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

     
        for (int i = 0; i < n1; ++i){
            L[i] =num[l + i];}
        for (int j = 0; j < n2; ++j){
            R[j] =  num[m + 1 + j];}

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                num[k] = L[i];
                i++;
            }
            else {
                num[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            num[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            num[k] = R[j];
            j++;
            k++;
        }
    }
    
    public void mergeSort(int[] arr, int l , int r){
        int m = l + (r - l) / 2;

        if(l<r){    
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
        }
           
        merge(arr, l, m, r);
    }
    public boolean containsDuplicate(int[] nums) {
        mergeSort(nums, 0, nums.length -1);

        for(int i =0; i< nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        Duplicates d = new Duplicates();
        int[] ar = {2,5,3,1,7,4,0,3,4};

        System.out.print(d.containsDuplicate(ar));
    }
}
