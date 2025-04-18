class Solution {
    public int solution(int num) {
        int answer = 0;
        if(num==1) return 0;
        long n = (long)num;
        
        
        while(answer<500){
            answer++;
            if(n%2==0) n/=2;
            else n=n*3+1;
            
            if(n==1) return answer;
        }
        
        return -1;
    }
}