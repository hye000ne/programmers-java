class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c==' ') {
                sb.append(' ');
            } else if(Character.isUpperCase(c)) {
                if((int)(c+n)>90) c -=26;
                sb.append((char)(c+n));
            } else {                
                if((int)(c+n)>122) c -=26;
                sb.append((char)(c+n));
            }
        }
        return sb.toString();
    }
}