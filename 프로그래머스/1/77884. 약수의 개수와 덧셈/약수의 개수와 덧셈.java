class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++){
            int cnt = 0;
            for(int j=1;j<=Math.sqrt(i);j++){
                if(j*j==i) cnt++;
                else if(i%j==0) cnt +=2;
            }
            answer += (cnt%2==0)? i : -i;
        }
        // 다른 사람 풀이 : 제곱근이면 홀수 제곱근 아니면 짝수
        return answer;
    }
}