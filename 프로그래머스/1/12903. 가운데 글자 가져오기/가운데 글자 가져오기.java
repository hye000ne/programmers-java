class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0) s = s.substring(s.length()/2-1,s.length()/2+1);
        else s = s.substring(s.length()/2,s.length()/2+1);
        
        return s;
    }
}