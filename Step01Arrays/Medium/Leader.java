package Step01Arrays.Medium;
import java.util.*;

public class Leader {
    public int[] FindLeader(int[] arr){
        List<Integer> fin = new ArrayList<>();
        
        for(int i =0; i<arr.length-1;i++){
            boolean check = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    check = false;
                }
            }
            if(check){
                fin.add(arr[i]);
            }
        }

        fin.add(arr[arr.length-1]);

        return fin.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args){
        Leader l = new Leader();

        int[] arr = {131,4,30,2,10, 22, 12, 3, 0, 6};

        int[] fin = l.FindLeader(arr);

        for(int i =0; i<fin.length;i++){
            System.out.print(fin[i] + " ");
        }
    }
}
