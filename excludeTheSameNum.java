import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int idx = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(arr[idx]);
        
        for(Integer a : arr){
            if(a != result.get(idx)){
                result.add(++idx, a);
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}