import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        int[] points = {3,2,1,0,-1,-2,-3};
        String[] types = {"RT","CF","JM","AN"};
        int[] jipyo = new int[4]; //RT / CF / JM / AN
        
        for(int i=0;i<survey.length;i++){
            String type = survey[i];
            int idx = choices[i]-1;
            for(int j=0;j<types.length;j++){
                if(type.indexOf(types[j].charAt(0)) > -1) {
                    if(type.indexOf(types[j].charAt(0)) == 0) jipyo[j] += points[idx];
                    else jipyo[j] -= points[idx];    
                }
            }
        }
        
        
        for(int i=0;i<types.length;i++){
            if(jipyo[i]<0) sb.append(types[i].charAt(1));
            else sb.append(types[i].charAt(0));
        }
        
        return sb.toString();
    }
}