import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for(String s : participant) hm.put(s, hm.getOrDefault(s, 0)+1);
        for(String s : completion) hm.put(s, hm.get(s)-1);
        HashSet<String> keys = new HashSet<>(hm.keySet());
        for(String key : keys){
            if(hm.get(key)==1) return key;
        }
        
        return answer;
    }
}