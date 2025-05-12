import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        char[] arr = dartResult.toCharArray();
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i])) {
                if(Character.isDigit(arr[i+1])){                    
                    score[idx] = 10;
                    i++;
                } else {
                    score[idx] = arr[i]-'0';
                }
                idx++;
            } else {
                if(arr[i] == 'D') score[idx-1] = score[idx-1]*score[idx-1];
                if(arr[i] == 'T') score[idx-1] = score[idx-1]*score[idx-1]*score[idx-1];
                if(arr[i] == '#') score[idx-1] *= -1;
                if(arr[i] == '*') {
                    if(idx-2>=0) score[idx-2] *= 2;
                    score[idx-1] *= 2;
                }
            }
        }
            
        for(int i : score) answer += i;
        
        return answer;
    }
}