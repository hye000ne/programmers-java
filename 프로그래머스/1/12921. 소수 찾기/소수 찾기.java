class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=3;i<=n;i++){
            boolean isDeci = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0) {
                    isDeci = false; 
                    break;
                }
            }
            if(isDeci) answer++;
        }
        return answer;
    }
}