import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        int[] xarr = new int[10];
        int[] yarr = new int[10];
        ArrayList<Integer> list = new ArrayList<>();
        for(char c : X.toCharArray()) xarr[c-'0']++;
        for(char c : Y.toCharArray()) yarr[c-'0']++;
        
        boolean onlyZero = true;
        
        for(int i=0;i<10;i++){
            if(xarr[i]>0&&yarr[i]>0){
                if(i>0) onlyZero = false;
                int min = Math.min(xarr[i], yarr[i]);
                while(min-- > 0) list.add(i);
            }
        }
        
        if(list.size() == 0) return "-1";
        if(onlyZero) return "0";
        
        Collections.sort(list, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(Integer i : list) sb.append(i);
        
        return sb.toString();
    }
}
