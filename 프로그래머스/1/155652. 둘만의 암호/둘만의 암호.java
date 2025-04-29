import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        int range;
        
        for(char c : s.toCharArray()){
            range = index;
            while(range>0){
                if(++c>122) c-=26;
                if(!skip.contains(c+"")) range--;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}