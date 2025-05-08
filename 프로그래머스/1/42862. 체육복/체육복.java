import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] stu = new int[n];
        Arrays.fill(stu,1);
        for(int i:lost) stu[i-1] = 0;
        for(int i:reserve) stu[i-1]++;
        
        for(int i=0;i<stu.length;i++){
            if(stu[i]==2){
                if(i-1>=0 && stu[i-1]==0){
                    stu[i-1]++;
                    stu[i]--;
                } else if(i+1< stu.length && stu[i+1]==0) {
                    stu[i+1]++;
                    stu[i]--;
                }
            }
        }
        for(int i : stu) if(i>0) answer++;
        return answer;
    }
}