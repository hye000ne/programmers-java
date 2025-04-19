import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for(int[] command : commands){
            int[] arr = new int[command[1]-command[0]+1];
            int idx = 0;
            
            for(int i=command[0]-1;i<command[1];i++) arr[idx++] = array[i];
            Arrays.sort(arr);
            answer[index++] = arr[command[2]-1];
        }
        return answer;
    }
} 