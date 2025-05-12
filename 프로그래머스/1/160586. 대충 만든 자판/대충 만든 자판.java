class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i=0;i<targets.length;i++){
            char[] target = targets[i].toCharArray();
            boolean isMatched = true;
            for(char c : target){
                int min = Integer.MAX_VALUE;
                for(int j=0;j<keymap.length;j++){
                    if(keymap[j].indexOf(c) == -1) continue;
                    min = Math.min(min, keymap[j].indexOf(c));
                }
                if(min == Integer.MAX_VALUE) {
                    isMatched = false;
                    break;
                }
                answer[i] += (min+1);
            }
            if(!isMatched) answer[i] = -1;
        }
        return answer;
    }
}