package Easy;
import java.util.Arrays;

public class Second_Large_Small_Brute{
    public int FindSecLarge(int[] arr){
        if (arr.length < 2)
            return -1;

        Arrays.sort(arr);

        int largest = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest)
                return arr[i];
        }

        return -1;
    }
    public int FindSecSmall(int[] arr){
          if (arr.length < 2)
            return -1;

        Arrays.sort(arr);

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != smallest)
                return arr[i];
        }

        return -1;
    }
}


class Main {
    public static void main(String[] args) {
        Second_Large_Small_Brute s = new Second_Large_Small_Brute();

        int[] a = {1,2,3,4,5};
        int[] b = {2,5,3,1,9,3,0};

        System.out.println(s.FindSecLarge(a));
        System.out.println(s.FindSecSmall(a));
        System.out.println(s.FindSecLarge(b));
        System.out.println(s.FindSecSmall(b));
    }
}
