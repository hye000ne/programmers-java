import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<t.length()-p.length()+1;i++) list.add(t.substring(i,i+p.length()));
        
        for(String s : list){
            if(Long.parseLong(p)>=Long.parseLong(s)) answer++;
        }

        return answer;
    }
}