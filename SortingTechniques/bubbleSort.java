package SortingTechniques;

public class bubbleSort {
    public void bubble(int[] arr){
        int n = arr.length;

        for(int i = n - 1; i >= 0; i--){
            for(int j = 0;j<= i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {12,43,22,10,7,88,1,0};

        bubbleSort b = new bubbleSort();
        b.bubble(arr);
    }
    
}
