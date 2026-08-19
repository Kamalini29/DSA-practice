package Step01Arrays.Easy;

public class Sort_Check{
    public boolean check_array(int[] arr, int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }

        return true;
    }
}


class main{
    public static void main(String[] args) {
        Sort_Check s = new Sort_Check();
        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = {2,1,4,5,6,3};

        System.out.println("arr 1 is a array : "+s.check_array(arr, arr.length));
        System.out.println("arr 2 is sorted : "+ s.check_array(arr2, arr2.length));


    }
}