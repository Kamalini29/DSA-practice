package Step01Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class LongSequence {

    public void merge(int[] arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }

        while (left <= mid)
            temp.add(arr[left++]);

        while (right <= high)
            temp.add(arr[right++]);

        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    }

    public void mergeSort(int[] arr, int low, int high) {

        if (low >= high)
            return;

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);

        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public int findSeq(int[] arr) {

        // IMPORTANT: arr.length - 1
        mergeSort(arr, 0, arr.length - 1);

        int n = 0;

        for (int i = 0; i < arr.length; i++) {

            int c = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + c == arr[j]) {
                    c++;
                } 
                else {
                    break;
                }
            }

            n = Math.max(n, c);
        }

        return n;
    }

    public static void main(String[] args) {

        int[] a = {100, 4, 200, 1, 3, 2};

        LongSequence solution = new LongSequence();

        int ans = solution.findSeq(a);

        System.out.println(
            "The longest consecutive sequence is " + ans
        );
    }
}