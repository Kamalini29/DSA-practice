package Intense_DSA;
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> findAnag(String[] str){
        Map<String, List<String>> anagram = new HashMap<>();

        for(String s : str){
            char[] alpabets = s.toCharArray();
            Arrays.sort(alpabets);

            String key = new String(alpabets);

            if(!anagram.containsKey(key)){
                anagram.put(key, new ArrayList<>());
            }

            anagram.get(key).add(s);   
        }
        
        return new ArrayList<>(anagram.values());
    }

    public static void main(String[] args){
        GroupAnagrams g = new GroupAnagrams();
        String[] str = {"ets","ste","ttw","wtt"};
        List<List<String>> n = g.findAnag(str);
        
        for(List<String> group : n){
            for(String st : group){
                System.out.print(st +" ");
            }
            System.out.println();
        }
    }
}
