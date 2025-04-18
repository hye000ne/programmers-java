class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int ori = x;
        while(x>0){
            sum += x%10;
            x/=10;
        }
        
        
        
        return ori%sum==0?true:false;
    }
}