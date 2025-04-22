import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            answer[i] = Integer.toString((arr1[i]|arr2[i]),2);
            
            String prefix = "0";
            prefix = prefix.repeat(n-answer[i].length());
            answer[i] = prefix + answer[i];
            
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0"," ");
        }
        
        return answer;
    }
}