class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    int num = nums[i]+nums[j]+nums[k];
                    boolean isDemi = true;
                    for(int d=2;d<=Math.sqrt(num);d++){
                        if(num%d==0){
                            isDemi = false;
                            break;
                        }
                    }
                    
                    if(isDemi) answer++;
                }
            }
        }

        return answer;
    }
}