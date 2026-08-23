package SortingTechniques;

public class RecursiveBubble {
    public void recBubble(int[] arr, int n){
        if(n==1) return;
        boolean isSwapped = false;

        for(int j =1; j<n; j++){
            if(arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                isSwapped = true; 
            }
        }

        if (!isSwapped) return;

        recBubble(arr, n-1);
    }

    public static void main(String[] args){
        int[] arr = {12,43,22,10,7,88,1,0};

        RecursiveBubble s = new RecursiveBubble();
        s.recBubble(arr, arr.length);
        System.out.println("After sortinhg : ");

        for(int i =0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
