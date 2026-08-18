package Basics.Math;
import java.util.*;

public class Divisors {
    public int[] findDivisor(int n){
        List<Integer> Divisor = new ArrayList<>();

        for(int i =1; i<=n;i++){
            if(n%i == 0){
                Divisor.add(i);
            }
        }

        int[] result = new int[Divisor.size()];
        for(int i = 0; i < Divisor.size(); i++){
            result[i] = Divisor.get(i);
        }
        return result;
    }
    public static void main(String[] args){
        Divisors d = new Divisors();
        int[] div = d.findDivisor(100);
        System.out.println(Arrays.toString(div));
    }
}
