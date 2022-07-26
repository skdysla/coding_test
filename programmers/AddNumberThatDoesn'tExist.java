import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] nums = {1,2,3,4,5,6,7,8,9};
        
        List<Integer> list = Arrays.stream(nums).boxed().
            collect(Collectors.toList());
        
        for(int n : numbers){
            list.remove((Integer)n);
        }
        
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}