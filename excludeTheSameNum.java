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
        
        int[] answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}