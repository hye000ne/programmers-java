import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(char c : s.toCharArray()){
            if(c == ' ') {
                sb.append(c);
                idx = 0;
                continue;
            }
            
            if(idx%2==0) sb.append(Character.toUpperCase(c));
            else sb.append(Character.toLowerCase(c));
            idx++;
        }        
        return sb.toString();
    }
}