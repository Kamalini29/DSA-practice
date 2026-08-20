package SortingTechniques;

public class selectionSort{
    public void selectSort(int[] arr){
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            int min =0;
            for(int j =i; j<n; j++){
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap smallest element with arr[i]
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
    }
        System.out.println("Sorted:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args){
        int[] arr = {12,43,22,10,7,88,1,0};

        selectionSort s = new selectionSort();
        s.selectSort(arr);
    }
}