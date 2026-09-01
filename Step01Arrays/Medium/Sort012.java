package Step01Arrays.Medium;



public class Sort012 {
    public int[] helper(int[] arr){
        if(arr.length == 0) return null;
        int[] count = new int[3];
        for(int i=0; i< arr.length; i++){
            if(arr[i] == 0){
                count[0]++;
            }
            else if(arr[i] == 1){
                count[1]++;
            }
            else if(arr[i] == 2){
                count[2]++;
            }
        }
        return count;
    }

    public int[] inplaceSorting(int[] arr){
        int[] count = helper(arr);
       
        int cnt0 = count[0];
        int cnt1 = count[1];
        int cnt2 = count[2];
        int i =0;
        while(cnt0>0){
            arr[i] = 0;
            i++;
            cnt0--;
        }
        while(cnt1>0){
            arr[i] = 1;
            i++;
            cnt1--;
        }
        while(cnt2>0){
            arr[i] = 2;
            i++;
            cnt2--;
        }
        return arr;
            
        }
        

    public static void main(String[] args) {
        Sort012 s = new Sort012();

        int[] a = {0,1,0,2,1,2,0};

        a = s.inplaceSorting(a);

        for(int i =0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }

      
    }
}
