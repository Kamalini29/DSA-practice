package Basics.Math;

import java.util.ArrayList;
import java.util.List;

public class CheckPrime {
    public boolean isPrime(int n){
        List<Integer> div = new ArrayList<>();

        for(int i =1; i<=n; i++){
            if(n%i == 0){
                div.add(i);
            }
        }

        if(div.size() == 2){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        CheckPrime p = new CheckPrime();
        boolean b = p.isPrime(4);

        System.out.println("is prime:(4) "+b);
    }
}
