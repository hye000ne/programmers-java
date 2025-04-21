import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        HashMap<String, String> hm = new HashMap<>();
        
        for(int i=0;i<strings.length;i++){
            answer[i] = strings[i].charAt(n) + strings[i];
            hm.put(answer[i], strings[i]);
        }
        
        Arrays.sort(answer);
        for(int i=0;i<answer.length;i++){
            answer[i] = hm.get(answer[i]);
        }
        return answer;
    }
}