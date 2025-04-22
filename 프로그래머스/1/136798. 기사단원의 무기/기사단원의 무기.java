class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        for(int i=2;i<=number;i++){
            int cnt = 0;
            for(int j=1;j<=Math.sqrt(i);j++){
                if(j*j==i) cnt++;
                else if(i%j==0) cnt+=2;
            }
            answer+=(cnt>limit)?power:cnt;
        }
        return answer;
    }
}