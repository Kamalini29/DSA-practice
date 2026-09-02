package Intense_DSA;

public class MoveZeros {

    public int[] move(int[] arr){
        int l =0;

        for(int r=0; r< arr.length;r++){
            if(arr[r] !=0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
            }

        }
        
        return arr;
    }
    public static void main(String[] args) {
        MoveZeros s = new MoveZeros();

        int[] a = {1,0,4,0,10,0};

        a =  s.move(a);

        for(int i =0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }

      
    }
}
