class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        String[] excepts = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(int i=0;i<babbling.length;i++) {
            for(String exc : excepts) babbling[i] = babbling[i].replaceAll(exc,"1");
            for(String word : words) babbling[i] = babbling[i].replaceAll(word," ");

            if(babbling[i].trim().length()==0) answer++;
        }
        return answer;
    }
}