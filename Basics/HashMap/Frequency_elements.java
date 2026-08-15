package Basics.HashMap;

import java.util.ArrayList;
import java.util.List;

public class Frequency_elements{
    public void calc_freq(int[] arr){
        List<Integer> current = new ArrayList<>();
        for(int i =0; i< arr.length ; i++){
            int curr = arr[i];    
            int count =0;
            for(int j =0; j<arr.length; j++){
                if(arr[j] == curr && ! (current.contains(curr)) ){
                    count++;
                }
                
            }
            if (! current.contains(curr)){
            System.out.println(curr + "  : "+ count);
            }
            current.add(curr);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,1,2,2,3,3,3,1};
        
        Frequency_elements f = new Frequency_elements();
        f.calc_freq(arr);
    }

}

