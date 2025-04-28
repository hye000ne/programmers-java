class Solution {
    public int solution(String s) {
        int answer = 1;
        char[] arr = s.toCharArray();
        int cnt = 0;
        char x = s.charAt(0);
        for(int i=0;i<arr.length-1;i++){
            cnt += (arr[i]==x)? 1:-1;
            
            if(cnt==0) {
                answer++;
                x = arr[i+1];
            }
        }
        return answer;
    }
}