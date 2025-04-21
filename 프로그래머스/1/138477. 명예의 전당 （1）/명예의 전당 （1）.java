import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<score.length;i++){
            if(st.size()<k) {
                st.push(score[i]);
            } else {
                if(st.peek() < score[i]) {
                    st.pop();
                    st.push(score[i]);
                }
            }
            Collections.sort(st, Collections.reverseOrder());
            answer[i] = st.peek();
        }
        
        return answer;
    }
}