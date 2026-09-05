package Step01Arrays.Easy;
import java.util.*;

public class MajorityElem{
    public int findMode(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
  
   

        for(int key : arr){
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for(int key : map.keySet()){
            
            if( map.get(key) > (arr.length/2)){
                return key;
            }
        }

        return -1;
    }

    public void main(String[] args){
        MajorityElem m = new MajorityElem();
        int[] arr = {2,5,3,2,2,2,4,2,2,2};
        System.out.println(" "+m.findMode(arr));
    }
}