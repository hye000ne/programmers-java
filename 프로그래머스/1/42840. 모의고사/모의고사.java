import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] scores = new int[3];
        int[] std1 = {1, 2, 3, 4, 5};
        int[] std2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] std3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
                
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<answers.length;i++){
            if(answers[i]==std1[i%(std1.length)]) scores[0]++;
            if(answers[i]==std2[i%(std2.length)]) scores[1]++;
            if(answers[i]==std3[i%(std3.length)]) scores[2]++;
        }
        
        int max = scores[0];
        for(int i : scores) max = Math.max(max, i);
        for(int i=0;i<scores.length;i++){
            if(max==scores[i]) list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++) answer[i] = list.get(i);
        
        return answer;
    }
}