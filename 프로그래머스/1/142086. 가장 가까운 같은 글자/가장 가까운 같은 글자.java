import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<String, Integer> hm = new HashMap<>();
        String[] arr = s.split("");
        
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])) answer[i] = i-hm.get(arr[i]);
            else answer[i] = -1;
            hm.put(arr[i], i);
        }
        
        return answer;
    }
}