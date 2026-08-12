package Basics.Recursion;

import java.util.Arrays;

public class Reverse_Array {
    public int[] reversed_array(int[] a, int left, int right) {
        if (a == null || a.length <= 1 || left >= right) {
            return a;
        }

        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;

        return reversed_array(a, left + 1, right - 1);
    }

    public class Main {
        public static void main(String[] args) {
            Reverse_Array r = new Reverse_Array();
            int[] a = {2, 3, 45, 6, 1, 0};
            System.out.println(Arrays.toString(r.reversed_array(a, 0, a.length - 1)));
        }
    }
}
