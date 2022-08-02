import java.util.ArrayList;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        ArrayList<Integer> arr;
        
        for(int i = 0; i < commands.length; i++){
            arr = new ArrayList<>();
            for(int k = commands[i][0] - 1; k < commands[i][1]; k++){
                arr.add(array[k]);
            }
            
            //오름차순 정렬
            arr.sort(null);
            answer[i] = arr.get(commands[i][2] - 1);
        }
        
        return answer;
    }
}