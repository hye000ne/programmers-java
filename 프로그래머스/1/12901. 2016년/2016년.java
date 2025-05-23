class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] dates = {31,29,31,30,31,30,31,31,30,31,30,31};
        int total = b-1;
        
        for(int i=1;i<a;i++) total += dates[i-1];
        
        return day[(total%7)];
    }
}