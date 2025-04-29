import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int players = stages.length; //플레이어 수

		int[] stage_player = new int[N]; //스테이지당 사람
        for(int i=0;i<stages.length;i++) {
			if(stages[i]==N+1) continue;
			stage_player[stages[i]-1]++;
        }

        HashMap<Integer,Double> failureRate = new HashMap<>(); //스테이지당 실패율
        for(int i=0;i<N;i++) {
            if(players == 0) {
                failureRate.put(i+1, 0.0);
                continue;
            }
            failureRate.put(i+1, stage_player[i]/(double)players);
            players-=stage_player[i];
        }

        ArrayList<Map.Entry<Integer,Double>> list = new ArrayList<>(failureRate.entrySet());
        Collections.sort(list, (o1,o2)->o2.getValue().compareTo(o1.getValue()));
        int idx = 0;
		for(Map.Entry<Integer, Double> entry : list) {
            answer[idx++] = entry.getKey();
        }
        
        return answer;
    }
}