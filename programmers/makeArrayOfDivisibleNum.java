import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0)
                result.add(arr[i]);
        }
        
        //오름차순 정렬
        result.sort(null);
        
        int[] answer = result.stream().mapToInt(i -> i).toArray();
        if(answer.length == 0)
            return new int[]{-1};
        
        return answer;
    }
}