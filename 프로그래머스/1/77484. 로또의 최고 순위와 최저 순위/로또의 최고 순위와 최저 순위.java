import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int score = 0;
        int zero_cnt = 0;
        for(int i : lottos){
            if(i==0) zero_cnt++;
            for(int j : win_nums) if(i==j) score++;
        }
        
        return new int[]{Math.min(7-(score+zero_cnt),6), Math.min(7-score,6)};
    }
}