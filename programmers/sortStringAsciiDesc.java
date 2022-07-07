import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] tmp = s.toCharArray();
        Arrays.sort(tmp);
        
        answer = new StringBuilder(String.valueOf(tmp)).reverse().toString();
        return answer;
        
        // for(int i = 0; i < tmp.length - 1; i++){
        //     int max = i;
        //     for(int j = i+1; j < tmp.length; j++){
        //         if((int)tmp[j] > (int)tmp[max]){
        //             max = j;
        //         }
        //     }
        //     char temp = tmp[i];
        //     tmp[i] = tmp[max];
        //     tmp[max] = temp;
        // }
        // answer = String.valueOf(tmp);
        // return answer;
    }
}
