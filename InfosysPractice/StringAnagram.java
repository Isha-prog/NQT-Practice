import java.util.*;
public class StringAnagram{
    public static void main(String args[]){
        HashMap<String,List<String>> map = new HashMap<>();
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        for(String str:arr){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        System.out.println(map.values());
    }
}